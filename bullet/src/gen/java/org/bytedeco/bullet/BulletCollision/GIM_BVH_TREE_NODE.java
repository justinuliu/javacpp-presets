// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Node Structure for trees */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class GIM_BVH_TREE_NODE extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GIM_BVH_TREE_NODE(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GIM_BVH_TREE_NODE(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GIM_BVH_TREE_NODE position(long position) {
        return (GIM_BVH_TREE_NODE)super.position(position);
    }
    @Override public GIM_BVH_TREE_NODE getPointer(long i) {
        return new GIM_BVH_TREE_NODE((Pointer)this).offsetAddress(i);
    }

	public GIM_BVH_TREE_NODE() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean isLeafNode();

	public native int getEscapeIndex();

	public native void setEscapeIndex(int index);

	public native int getDataIndex();

	public native void setDataIndex(int index);
}
