// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_rnn_cell_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_rnn_cell_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_rnn_cell_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_rnn_cell_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_rnn_cell_desc_t position(long position) {
        return (mkldnn_rnn_cell_desc_t)super.position(position);
    }
    @Override public mkldnn_rnn_cell_desc_t getPointer(long i) {
        return new mkldnn_rnn_cell_desc_t((Pointer)this).offsetAddress(i);
    }

    /** RNN cell kind. Must be one of #mkldnn_vanilla_rnn,
     * #mkldnn_vanilla_lstm, #mkldnn_vanilla_gru,
     * or #mkldnn_gru_linear_before_reset. */
    public native @Cast("mkldnn_alg_kind_t") int cell_kind(); public native mkldnn_rnn_cell_desc_t cell_kind(int setter);
    /** Activation function used. Must be either #mkldnn_eltwise_relu or
     * #mkldnn_eltwise_tanh. */
    public native @Cast("mkldnn_alg_kind_t") int activation_kind(); public native mkldnn_rnn_cell_desc_t activation_kind(int setter);
    /** RNN cell flags */
    public native @Cast("unsigned int") int flags(); public native mkldnn_rnn_cell_desc_t flags(int setter);
    /** \c alpha is a negative slope parameter (used only if
     * {@code (flags & #mkldnn_rnn_cell_with_relu) != 0}) */
    public native float alpha(); public native mkldnn_rnn_cell_desc_t alpha(float setter);
    /** clipping parameter (used only if
     * {@code (flags & #mkldnn_rnn_cell_with_clipping) != 0}) */
    public native float clipping(); public native mkldnn_rnn_cell_desc_t clipping(float setter);
}
