package ocp.oop.example6;

public class B {

  /**
   *  default access mode - package mode: don't put anything
   *  for public: put 'public' access modifier
   *  for private: put 'private' access modifier
   *  // protected members can be access like default mode, and by class inherit the class
   *  for protected: put 'protected' access modifier
   */


  /**
   * Order of access modifier from the most public to the most private
   * public
   * protected
   * default access mode
   * private
   */
  int x;
  protected static int z;

  public static void m() {
    // private int x; // CF: access modifier not allowed inside local blocs
    // public int z; ... kifkif
  }
}
