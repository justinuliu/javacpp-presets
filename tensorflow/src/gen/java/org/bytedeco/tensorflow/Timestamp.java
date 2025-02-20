// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Provides the time since epoch in seconds.
 * 
 *  Returns the timestamp as a {@code float64} for seconds since the Unix epoch.
 * 
 *  Note: the timestamp is computed when the op is executed, not when it is added
 *  to the graph.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The ts tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Timestamp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Timestamp(Pointer p) { super(p); }

  public Timestamp(@Const @ByRef Scope scope) { super((Pointer)null); allocate(scope); }
  private native void allocate(@Const @ByRef Scope scope);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Timestamp operation(Operation setter);
  public native @ByRef Output ts(); public native Timestamp ts(Output setter);
}
