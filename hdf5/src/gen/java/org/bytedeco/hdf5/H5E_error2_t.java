// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * Information about an error; element of error stack
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5E_error2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5E_error2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5E_error2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5E_error2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5E_error2_t position(long position) {
        return (H5E_error2_t)super.position(position);
    }
    @Override public H5E_error2_t getPointer(long i) {
        return new H5E_error2_t((Pointer)this).offsetAddress(i);
    }

    
    /** Class ID                           */
    public native @Cast("hid_t") long cls_id(); public native H5E_error2_t cls_id(long setter);
    
    /** Major error ID                        */
    public native @Cast("hid_t") long maj_num(); public native H5E_error2_t maj_num(long setter);
    
    /** Minor error number                    */
    public native @Cast("hid_t") long min_num(); public native H5E_error2_t min_num(long setter);
    
    /** Line in file where error occurs    */
    public native @Cast("unsigned") int line(); public native H5E_error2_t line(int setter);
    
    /** Function in which error occurred   */
    public native @Cast("const char*") BytePointer func_name(); public native H5E_error2_t func_name(BytePointer setter);
    
    /** File in which error occurred       */
    public native @Cast("const char*") BytePointer file_name(); public native H5E_error2_t file_name(BytePointer setter);
    
    /** Optional supplied description      */
    public native @Cast("const char*") BytePointer desc(); public native H5E_error2_t desc(BytePointer setter);
}
