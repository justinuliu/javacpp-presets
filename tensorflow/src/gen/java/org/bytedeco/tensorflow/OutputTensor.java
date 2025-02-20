// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents an output of a node, i.e., the `index`-th output of `node`. Note
// that a single `OutputTensor` can correspond to multiple `Edge`s if the output
// is consumed by multiple destination nodes.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OutputTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OutputTensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OutputTensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OutputTensor position(long position) {
        return (OutputTensor)super.position(position);
    }
    @Override public OutputTensor getPointer(long i) {
        return new OutputTensor((Pointer)this).offsetAddress(i);
    }

  public native Node node(); public native OutputTensor node(Node setter);
  public native int index(); public native OutputTensor index(int setter);

  public OutputTensor(Node n, int i) { super((Pointer)null); allocate(n, i); }
  private native void allocate(Node n, int i);
  public OutputTensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Returns true if this OutputTensor is identical to 'other'. Nodes are
  // compared using pointer equality.
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef OutputTensor other);

  // A hash function for OutputTensors. Nodes are hashed based on their pointer
  // value.
  public static class Hash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hash position(long position) {
          return (Hash)super.position(position);
      }
      @Override public Hash getPointer(long i) {
          return new Hash((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("tensorflow::uint64") @Name("operator ()") long apply(@Const @ByRef OutputTensor s);
  }
}
