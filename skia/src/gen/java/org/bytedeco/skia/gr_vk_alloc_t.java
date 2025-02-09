// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class gr_vk_alloc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gr_vk_alloc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gr_vk_alloc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gr_vk_alloc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gr_vk_alloc_t position(long position) {
        return (gr_vk_alloc_t)super.position(position);
    }
    @Override public gr_vk_alloc_t getPointer(long i) {
        return new gr_vk_alloc_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint64_t") long fMemory(); public native gr_vk_alloc_t fMemory(long setter);
    public native @Cast("uint64_t") long fOffset(); public native gr_vk_alloc_t fOffset(long setter);
    public native @Cast("uint64_t") long fSize(); public native gr_vk_alloc_t fSize(long setter);
    public native @Cast("uint32_t") int fFlags(); public native gr_vk_alloc_t fFlags(int setter);
    public native @Cast("gr_vk_backendmemory_t") long fBackendMemory(); public native gr_vk_alloc_t fBackendMemory(long setter);
    public native @Cast("bool") boolean _private_fUsesSystemHeap(); public native gr_vk_alloc_t _private_fUsesSystemHeap(boolean setter);
}
