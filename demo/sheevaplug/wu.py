import sys
import serial
import time
from datetime import datetime
import time
import socket
import math
import serialtool as st

wu = {"ts":datetime.now(), "p":0, "q":0}

def parseData(data):
	global wu
	tmp = data.rsplit(",")
	p = int(tmp[3])
	s = int(tmp[20])
	pf = int(tmp[16])
	q = int(math.sqrt(s**2 - p**2))
	wu["ts"] = datetime.now()
	wu["p"] = p
	wu["q"] = q

def WU_UDPTx_Thread(cfg, DEBUG):
	global wu
	pcount = 0
	qcount = 0
	sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
	while True:
		pdiv = int(cfg["P_RATE_DIV"])
		if pdiv != 0:
			pcount = (pcount + 1) % pdiv
			if pcount == 0:
				datastr = "%d"%wu["p"]
				sock.sendto(datastr, (cfg["UDP_IP"], int(cfg["P_UDP_PORT"])))
				if DEBUG:
					print "p=%d %d %s"%(pdiv, pcount, datastr)

		qdiv = int(cfg["Q_RATE_DIV"])
		if qdiv != 0:
			qcount = (qcount + 1) % qdiv
			if qcount == 0:
				datastr = "%d"%wu["q"]
				sock.sendto(datastr, (cfg["UDP_IP"], int(cfg["Q_UDP_PORT"])))
				if DEBUG:
					print "q=%d %d %s"%(qdiv, qcount, datastr)

		time.sleep(1.0)

def WU_SerialRx_Thread(cfg, DEBUG):
	while True:
		serport = st.detect(cfg["WU_NAME"], cfg["WU_ID"], 0.1)
		ser = st.connect(cfg["WU_ALIAS"], serport, 115200, 2, 0.1)
		while True:
			try:
				line = ser.readline()
				if line == "":
					st.disconnect(cfg["WU_ALIAS"], ser)
					break
				parseData(line[1:len(line)-3])
				if DEBUG:
					print "%s %s"%(line, datastr)
			except KeyboardInterrupt:
				quit()
			except:
				st.disconnect(cfg["WU_ALIAS"], ser)
				break
