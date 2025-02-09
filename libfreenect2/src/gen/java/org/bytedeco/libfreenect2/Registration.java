// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


/** \defgroup registration Registration and Geometry
 * Register depth to color, create point clouds. */

/** Combine frames of depth and color camera. \ingroup registration
 * Right now this class uses a reverse engineered formula that uses factory
 * preset extrinsic parameters.  We do not have a clear understanding of these
 * particular extrinsic parameters and do not know how to calibrate them by
 * hand.
 *
 * If you want to perform registration with standard camera extrinsic matrix,
 * you probably need something else.
 */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class Registration extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Registration(Pointer p) { super(p); }

  /**
   * @param depth_p Depth camera parameters. You can use the factory values, or use your own.
   * @param rgb_p Color camera parameters. Probably use the factory values for now.
   */
  public Registration(@ByVal Freenect2Device.IrCameraParams depth_p, @ByVal Freenect2Device.ColorCameraParams rgb_p) { super((Pointer)null); allocate(depth_p, rgb_p); }
  private native void allocate(@ByVal Freenect2Device.IrCameraParams depth_p, @ByVal Freenect2Device.ColorCameraParams rgb_p);

  /** Undistort and register a single depth point to color camera.
   * @param dx Distorted depth coordinate x (pixel)
   * @param dy Distorted depth coordinate y (pixel)
   * @param dz Depth value (millimeter)
   * @param cx [out] Undistorted color coordinate x (normalized)
   * @param cy [out] Undistorted color coordinate y (normalized)
   */
  public native void apply(int dx, int dy, float dz, @ByRef FloatPointer cx, @ByRef FloatPointer cy);
  public native void apply(int dx, int dy, float dz, @ByRef FloatBuffer cx, @ByRef FloatBuffer cy);
  public native void apply(int dx, int dy, float dz, @ByRef float[] cx, @ByRef float[] cy);

  /** Map color images onto depth images
   * @param rgb Color image (1920x1080 BGRX)
   * @param depth Depth image (512x424 float)
   * @param undistorted [out] Undistorted depth image
   * @param registered [out] Color image for the depth image (512x424)
   * @param enable_filter Filter out pixels not visible to both cameras.
   * @param bigdepth [out] If not {@code NULL}, return mapping of depth onto colors (1920x1082 float). **1082** not 1080, with a blank top and bottom row.
   * @param color_depth_map [out] Index of mapped color pixel for each depth pixel (512x424).
   */
  public native void apply(@Const Frame rgb, @Const Frame depth, Frame undistorted, Frame registered, @Cast("const bool") boolean enable_filter/*=true*/, Frame bigdepth/*=0*/, IntPointer color_depth_map/*=0*/);
  public native void apply(@Const Frame rgb, @Const Frame depth, Frame undistorted, Frame registered);
  public native void apply(@Const Frame rgb, @Const Frame depth, Frame undistorted, Frame registered, @Cast("const bool") boolean enable_filter/*=true*/, Frame bigdepth/*=0*/, IntBuffer color_depth_map/*=0*/);
  public native void apply(@Const Frame rgb, @Const Frame depth, Frame undistorted, Frame registered, @Cast("const bool") boolean enable_filter/*=true*/, Frame bigdepth/*=0*/, int[] color_depth_map/*=0*/);

  /** Undistort depth
   * @param depth Depth image (512x424 float)
   * @param undistorted [out] Undistorted depth image
   */
  public native void undistortDepth(@Const Frame depth, Frame undistorted);

  /** Construct a 3-D point with color in a point cloud.
   * @param undistorted Undistorted depth frame from apply().
   * @param registered Registered color frame from apply().
   * @param r Row (y) index in depth image.
   * @param c Column (x) index in depth image.
   * @param x [out] X coordinate of the 3-D point (meter).
   * @param y [out] Y coordinate of the 3-D point (meter).
   * @param z [out] Z coordinate of the 3-D point (meter).
   * @param rgb [out] Color of the 3-D point (BGRX). To unpack the data, use
   *
   *     const uint8_t *p = reinterpret_cast<uint8_t*>(&rgb);
   *     uint8_t b = p[0];
   *     uint8_t g = p[1];
   *     uint8_t r = p[2];
   */
  public native void getPointXYZRGB(@Const Frame undistorted, @Const Frame registered, int r, int c, @ByRef FloatPointer x, @ByRef FloatPointer y, @ByRef FloatPointer z, @ByRef FloatPointer rgb);
  public native void getPointXYZRGB(@Const Frame undistorted, @Const Frame registered, int r, int c, @ByRef FloatBuffer x, @ByRef FloatBuffer y, @ByRef FloatBuffer z, @ByRef FloatBuffer rgb);
  public native void getPointXYZRGB(@Const Frame undistorted, @Const Frame registered, int r, int c, @ByRef float[] x, @ByRef float[] y, @ByRef float[] z, @ByRef float[] rgb);

  /** Construct a 3-D point in a point cloud.
   * @param undistorted Undistorted depth frame from apply().
   * @param r Row (y) index in depth image.
   * @param c Column (x) index in depth image.
   * @param x [out] X coordinate of the 3-D point (meter).
   * @param y [out] Y coordinate of the 3-D point (meter).
   * @param z [out] Z coordinate of the 3-D point (meter).
   */
  public native void getPointXYZ(@Const Frame undistorted, int r, int c, @ByRef FloatPointer x, @ByRef FloatPointer y, @ByRef FloatPointer z);
  public native void getPointXYZ(@Const Frame undistorted, int r, int c, @ByRef FloatBuffer x, @ByRef FloatBuffer y, @ByRef FloatBuffer z);
  public native void getPointXYZ(@Const Frame undistorted, int r, int c, @ByRef float[] x, @ByRef float[] y, @ByRef float[] z);
}
