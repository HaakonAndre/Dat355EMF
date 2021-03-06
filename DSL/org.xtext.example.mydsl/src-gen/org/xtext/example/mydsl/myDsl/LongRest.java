/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LongRest#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLongRest()
 * @model
 * @generated
 */
public interface LongRest extends Rest
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLongRest_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LongRest#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

} // LongRest
