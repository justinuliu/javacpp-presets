// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_ThreadOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_ThreadOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_ThreadOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ThreadOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_ThreadOptions position(long position) {
        return (TF_ThreadOptions)super.position(position);
    }
    @Override public TF_ThreadOptions getPointer(long i) {
        return new TF_ThreadOptions((Pointer)this).offsetAddress(i);
    }

  // Thread stack size to use (in bytes), zero implies that the system default
  // will be used.
  public native @Cast("size_t") long stack_size(); public native TF_ThreadOptions stack_size(long setter);

  // Guard area size to use near thread stacks to use (in bytes), zero implies
  // that the system default will be used.
  public native @Cast("size_t") long guard_size(); public native TF_ThreadOptions guard_size(long setter);

  // The NUMA node to use, -1 implies that there should be no NUMA affinity for
  // this thread.
  public native int numa_node(); public native TF_ThreadOptions numa_node(int setter);
}
