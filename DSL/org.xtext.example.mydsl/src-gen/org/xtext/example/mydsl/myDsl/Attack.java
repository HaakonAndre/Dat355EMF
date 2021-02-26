/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Attack#getDamage <em>Damage</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAttack()
 * @model
 * @generated
 */
public interface Attack extends Actions
{
  /**
   * Returns the value of the '<em><b>Damage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Damage</em>' attribute.
   * @see #setDamage(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAttack_Damage()
   * @model
   * @generated
   */
  int getDamage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Attack#getDamage <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damage</em>' attribute.
   * @see #getDamage()
   * @generated
   */
  void setDamage(int value);

} // Attack