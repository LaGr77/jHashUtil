package app.LaGr77.jHashUtil.util;

/**
 * Algorithm
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.1.2022-03-11
 * @since 2022-02-02
 */
public enum Algo {
   MD2("MD2"),
   MD5("MD5"),
   SHA1("SHA-1"),
   SHA224("SHA-224"),
   SHA256("SHA-256"),
   SHA384("SHA-384"),
   SHA512("SHA-512"); 

   /**
    * Constructor
    * @param algo {@link String}
    */
   private Algo (String algo) {
      this.algo=algo;
   }

   /****************************************************************************************************
    *                                                                                          Get & Set
    ****************************************************************************************************/
   /**
    * @return {@link String}
    */
   public String getAlgo() {
      return algo;
   }

   /****************************************************************************************************
    *                                                                                          Variables
    ****************************************************************************************************/
   private String algo;
}