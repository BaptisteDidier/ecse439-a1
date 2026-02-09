/**
 */
package cps.impl;

import cps.Course;
import cps.CpsPackage;
import cps.PlannedSession;
import cps.Semester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.impl.PlannedSessionImpl#getTermOrder <em>Term Order</em>}</li>
 *   <li>{@link cps.impl.PlannedSessionImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link cps.impl.PlannedSessionImpl#getProposedCourses <em>Proposed Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedSessionImpl extends MinimalEObjectImpl.Container implements PlannedSession {
	/**
	 * The default value of the '{@link #getTermOrder() <em>Term Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int TERM_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTermOrder() <em>Term Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermOrder()
	 * @generated
	 * @ordered
	 */
	protected int termOrder = TERM_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final Semester SEMESTER_EDEFAULT = Semester.FALL;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProposedCourses() <em>Proposed Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> proposedCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.PLANNED_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTermOrder() {
		return termOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermOrder(int newTermOrder) {
		int oldTermOrder = termOrder;
		termOrder = newTermOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.PLANNED_SESSION__TERM_ORDER, oldTermOrder, termOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.PLANNED_SESSION__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getProposedCourses() {
		if (proposedCourses == null) {
			proposedCourses = new EObjectResolvingEList<Course>(Course.class, this, CpsPackage.PLANNED_SESSION__PROPOSED_COURSES);
		}
		return proposedCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpsPackage.PLANNED_SESSION__TERM_ORDER:
				return getTermOrder();
			case CpsPackage.PLANNED_SESSION__SEMESTER:
				return getSemester();
			case CpsPackage.PLANNED_SESSION__PROPOSED_COURSES:
				return getProposedCourses();
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
			case CpsPackage.PLANNED_SESSION__TERM_ORDER:
				setTermOrder((Integer)newValue);
				return;
			case CpsPackage.PLANNED_SESSION__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case CpsPackage.PLANNED_SESSION__PROPOSED_COURSES:
				getProposedCourses().clear();
				getProposedCourses().addAll((Collection<? extends Course>)newValue);
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
			case CpsPackage.PLANNED_SESSION__TERM_ORDER:
				setTermOrder(TERM_ORDER_EDEFAULT);
				return;
			case CpsPackage.PLANNED_SESSION__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case CpsPackage.PLANNED_SESSION__PROPOSED_COURSES:
				getProposedCourses().clear();
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
			case CpsPackage.PLANNED_SESSION__TERM_ORDER:
				return termOrder != TERM_ORDER_EDEFAULT;
			case CpsPackage.PLANNED_SESSION__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
			case CpsPackage.PLANNED_SESSION__PROPOSED_COURSES:
				return proposedCourses != null && !proposedCourses.isEmpty();
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
		result.append(" (termOrder: ");
		result.append(termOrder);
		result.append(", semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //PlannedSessionImpl
