/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'SPlugDataMsg'
 * message type.
 */

public class SPlugDataMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 12;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 89;

    /** Create a new SPlugDataMsg of size 12. */
    public SPlugDataMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new SPlugDataMsg of the given data_length. */
    public SPlugDataMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg with the given data_length
     * and base offset.
     */
    public SPlugDataMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg using the given byte array
     * as backing store.
     */
    public SPlugDataMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public SPlugDataMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public SPlugDataMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg embedded in the given message
     * at the given base offset.
     */
    public SPlugDataMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new SPlugDataMsg embedded in the given message
     * at the given base offset and length.
     */
    public SPlugDataMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <SPlugDataMsg> \n";
      try {
        s += "  [nodeID=0x"+Long.toHexString(get_nodeID())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [state=0x"+Long.toHexString(get_state())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [current=";
        for (int i = 0; i < 3; i++) {
          s += "0x"+Long.toHexString(getElement_current(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [aenergy=";
        for (int i = 0; i < 3; i++) {
          s += "0x"+Long.toHexString(getElement_aenergy(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeID
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeID' is signed (false).
     */
    public static boolean isSigned_nodeID() {
        return false;
    }

    /**
     * Return whether the field 'nodeID' is an array (false).
     */
    public static boolean isArray_nodeID() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeID'
     */
    public static int offset_nodeID() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeID'
     */
    public static int offsetBits_nodeID() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'nodeID'
     */
    public int get_nodeID() {
        return (int)getUIntBEElement(offsetBits_nodeID(), 16);
    }

    /**
     * Set the value of the field 'nodeID'
     */
    public void set_nodeID(int value) {
        setUIntBEElement(offsetBits_nodeID(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeID'
     */
    public static int size_nodeID() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeID'
     */
    public static int sizeBits_nodeID() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'counter'
     */
    public int get_counter() {
        return (int)getUIntBEElement(offsetBits_counter(), 16);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(int value) {
        setUIntBEElement(offsetBits_counter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: state
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'state' is signed (false).
     */
    public static boolean isSigned_state() {
        return false;
    }

    /**
     * Return whether the field 'state' is an array (false).
     */
    public static boolean isArray_state() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'state'
     */
    public static int offset_state() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'state'
     */
    public static int offsetBits_state() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'state'
     */
    public int get_state() {
        return (int)getUIntBEElement(offsetBits_state(), 16);
    }

    /**
     * Set the value of the field 'state'
     */
    public void set_state(int value) {
        setUIntBEElement(offsetBits_state(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'state'
     */
    public static int size_state() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'state'
     */
    public static int sizeBits_state() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: current
    //   Field type: short[], unsigned
    //   Offset (bits): 48
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'current' is signed (false).
     */
    public static boolean isSigned_current() {
        return false;
    }

    /**
     * Return whether the field 'current' is an array (true).
     */
    public static boolean isArray_current() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'current'
     */
    public static int offset_current(int index1) {
        int offset = 48;
        if (index1 < 0 || index1 >= 3) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'current'
     */
    public static int offsetBits_current(int index1) {
        int offset = 48;
        if (index1 < 0 || index1 >= 3) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'current' as a short[]
     */
    public short[] get_current() {
        short[] tmp = new short[3];
        for (int index0 = 0; index0 < numElements_current(0); index0++) {
            tmp[index0] = getElement_current(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'current' from the given short[]
     */
    public void set_current(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_current(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'current'
     */
    public short getElement_current(int index1) {
        return (short)getUIntBEElement(offsetBits_current(index1), 8);
    }

    /**
     * Set an element of the array 'current'
     */
    public void setElement_current(int index1, short value) {
        setUIntBEElement(offsetBits_current(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'current'
     */
    public static int totalSize_current() {
        return (24 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'current'
     */
    public static int totalSizeBits_current() {
        return 24;
    }

    /**
     * Return the size, in bytes, of each element of the array 'current'
     */
    public static int elementSize_current() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'current'
     */
    public static int elementSizeBits_current() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'current'
     */
    public static int numDimensions_current() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'current'
     */
    public static int numElements_current() {
        return 3;
    }

    /**
     * Return the number of elements in the array 'current'
     * for the given dimension.
     */
    public static int numElements_current(int dimension) {
      int array_dims[] = { 3,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'current' with a String
     */
    public void setString_current(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_current(i, (short)s.charAt(i));
         }
         setElement_current(i, (short)0); //null terminate
    }

    /**
     * Read the array 'current' as a String
     */
    public String getString_current() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,3)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_current(i) == (char)0) break;
             carr[i] = (char)getElement_current(i);
         }
         return new String(carr,0,i);
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: aenergy
    //   Field type: short[], unsigned
    //   Offset (bits): 72
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'aenergy' is signed (false).
     */
    public static boolean isSigned_aenergy() {
        return false;
    }

    /**
     * Return whether the field 'aenergy' is an array (true).
     */
    public static boolean isArray_aenergy() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'aenergy'
     */
    public static int offset_aenergy(int index1) {
        int offset = 72;
        if (index1 < 0 || index1 >= 3) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'aenergy'
     */
    public static int offsetBits_aenergy(int index1) {
        int offset = 72;
        if (index1 < 0 || index1 >= 3) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'aenergy' as a short[]
     */
    public short[] get_aenergy() {
        short[] tmp = new short[3];
        for (int index0 = 0; index0 < numElements_aenergy(0); index0++) {
            tmp[index0] = getElement_aenergy(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'aenergy' from the given short[]
     */
    public void set_aenergy(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_aenergy(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'aenergy'
     */
    public short getElement_aenergy(int index1) {
        return (short)getUIntBEElement(offsetBits_aenergy(index1), 8);
    }

    /**
     * Set an element of the array 'aenergy'
     */
    public void setElement_aenergy(int index1, short value) {
        setUIntBEElement(offsetBits_aenergy(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'aenergy'
     */
    public static int totalSize_aenergy() {
        return (24 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'aenergy'
     */
    public static int totalSizeBits_aenergy() {
        return 24;
    }

    /**
     * Return the size, in bytes, of each element of the array 'aenergy'
     */
    public static int elementSize_aenergy() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'aenergy'
     */
    public static int elementSizeBits_aenergy() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'aenergy'
     */
    public static int numDimensions_aenergy() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'aenergy'
     */
    public static int numElements_aenergy() {
        return 3;
    }

    /**
     * Return the number of elements in the array 'aenergy'
     * for the given dimension.
     */
    public static int numElements_aenergy(int dimension) {
      int array_dims[] = { 3,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'aenergy' with a String
     */
    public void setString_aenergy(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_aenergy(i, (short)s.charAt(i));
         }
         setElement_aenergy(i, (short)0); //null terminate
    }

    /**
     * Read the array 'aenergy' as a String
     */
    public String getString_aenergy() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,3)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_aenergy(i) == (char)0) break;
             carr[i] = (char)getElement_aenergy(i);
         }
         return new String(carr,0,i);
    }

}
