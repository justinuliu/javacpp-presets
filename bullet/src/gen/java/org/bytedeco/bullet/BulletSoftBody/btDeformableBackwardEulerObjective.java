// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableBackwardEulerObjective extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableBackwardEulerObjective(Pointer p) { super(p); }

	/** enum btDeformableBackwardEulerObjective::_ */
	public static final int
		Mass_preconditioner = 0,
		KKT_preconditioner = 1;
	@MemberGetter public native @Cast("btScalar") float m_dt();
	@MemberGetter public native @ByRef btDeformableLagrangianForceArray m_lf();
	@MemberGetter public native @ByRef btSoftBodyArray m_softBodies();
	@MemberGetter public native Preconditioner m_preconditioner();
	@MemberGetter public native @ByRef btDeformableContactProjection m_projection();
	@MemberGetter public native @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array m_backupVelocity();
	@MemberGetter public native @ByRef btSoftBodyNodePointerArray m_nodes();
	@MemberGetter public native @Cast("bool") boolean m_implicit();
	@MemberGetter public native MassPreconditioner m_massPreconditioner();
	@MemberGetter public native KKTPreconditioner m_KKTPreconditioner();

	public btDeformableBackwardEulerObjective(@ByRef btSoftBodyArray softBodies, @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array backup_v) { super((Pointer)null); allocate(softBodies, backup_v); }
	private native void allocate(@ByRef btSoftBodyArray softBodies, @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array backup_v);

	public native void initialize();

	// compute the rhs for CG solve, i.e, add the dt scaled implicit force to residual
	public native void computeResidual(@Cast("btScalar") float dt, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array residual);

	// add explicit force to the velocity
	public native void applyExplicitForce(@Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array force);

	// apply force to velocity and optionally reset the force to zero
	public native void applyForce(@Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array force, @Cast("bool") boolean setZero);

	// compute the norm of the residual
	public native @Cast("btScalar") float computeNorm(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array residual);

	// compute one step of the solve (there is only one solve if the system is linear)
	

	// perform A*x = b
	public native void multiply(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array x, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array b);

	// set initial guess for CG solve
	public native void initialGuess(@Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array dv, @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array residual);

	// reset data structure and reset dt
	public native void reinitialize(@Cast("bool") boolean nodeUpdated, @Cast("btScalar") float dt);

	public native void setDt(@Cast("btScalar") float dt);

	// add friction force to residual
	public native void applyDynamicFriction(@Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array r);

	// add dv to velocity
	public native void updateVelocity(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array dv);

	//set constraints as projections
	public native void setConstraints(@Const @ByRef btContactSolverInfo infoGlobal);

	// update the projections and project the residual
	public native void project(@Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array r);

	// perform precondition M^(-1) x = b
	public native void precondition(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array x, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array b);

	// reindex all the vertices
	public native void updateId();

	public native @Const btSoftBodyNodePointerArray getIndices();

	public native void setImplicit(@Cast("bool") boolean implicit);

	// Calculate the total potential energy in the system
	public native @Cast("btScalar") float totalEnergy(@Cast("btScalar") float dt);

	public native void addLagrangeMultiplier(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array vec, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array extended_vec);

	public native void addLagrangeMultiplierRHS(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array residual, @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array m_dv, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array extended_residual);

	public native void calculateContactForce(@Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array dv, @Cast("const btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array rhs, @Cast("btDeformableBackwardEulerObjective::TVStack*") @ByRef btVector3Array f);
}
