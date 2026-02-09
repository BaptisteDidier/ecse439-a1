/**
 */
package cps.impl;

import cps.Course;
import cps.CpsPackage;
import cps.PlannedSession;
import cps.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link cps.impl.StudentImpl#getTaken <em>Taken</em>}</li>
 *   <li>{@link cps.impl.StudentImpl#getMaxCredits <em>Max Credits</em>}</li>
 *   <li>{@link cps.impl.StudentImpl#getPlannedSessions <em>Planned Sessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaken() <em>Taken</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaken()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> taken;

	/**
	 * The default value of the '{@link #getMaxCredits() <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCredits() <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCredits()
	 * @generated
	 * @ordered
	 */
	protected int maxCredits = MAX_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlannedSessions() <em>Planned Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlannedSession> plannedSessions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getTaken() {
		if (taken == null) {
			taken = new EObjectContainmentEList<Course>(Course.class, this, CpsPackage.STUDENT__TAKEN);
		}
		return taken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxCredits() {
		return maxCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCredits(int newMaxCredits) {
		int oldMaxCredits = maxCredits;
		maxCredits = newMaxCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.STUDENT__MAX_CREDITS, oldMaxCredits, maxCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedSession> getPlannedSessions() {
		if (plannedSessions == null) {
			plannedSessions = new EObjectContainmentEList<PlannedSession>(PlannedSession.class, this, CpsPackage.STUDENT__PLANNED_SESSIONS);
		}
		return plannedSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsPackage.STUDENT__TAKEN:
				return ((InternalEList<?>)getTaken()).basicRemove(otherEnd, msgs);
			case CpsPackage.STUDENT__PLANNED_SESSIONS:
				return ((InternalEList<?>)getPlannedSessions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpsPackage.STUDENT__NAME:
				return getName();
			case CpsPackage.STUDENT__TAKEN:
				return getTaken();
			case CpsPackage.STUDENT__MAX_CREDITS:
				return getMaxCredits();
			case CpsPackage.STUDENT__PLANNED_SESSIONS:
				return getPlannedSessions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpsPackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case CpsPackage.STUDENT__TAKEN:
				getTaken().clear();
				getTaken().addAll((Collection<? extends Course>)newValue);
				return;
			case CpsPackage.STUDENT__MAX_CREDITS:
				setMaxCredits((Integer)newValue);
				return;
			case CpsPackage.STUDENT__PLANNED_SESSIONS:
				getPlannedSessions().clear();
				getPlannedSessions().addAll((Collection<? extends PlannedSession>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CpsPackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CpsPackage.STUDENT__TAKEN:
				getTaken().clear();
				return;
			case CpsPackage.STUDENT__MAX_CREDITS:
				setMaxCredits(MAX_CREDITS_EDEFAULT);
				return;
			case CpsPackage.STUDENT__PLANNED_SESSIONS:
				getPlannedSessions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CpsPackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CpsPackage.STUDENT__TAKEN:
				return taken != null && !taken.isEmpty();
			case CpsPackage.STUDENT__MAX_CREDITS:
				return maxCredits != MAX_CREDITS_EDEFAULT;
			case CpsPackage.STUDENT__PLANNED_SESSIONS:
				return plannedSessions != null && !plannedSessions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", maxCredits: ");
		result.append(maxCredits);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
