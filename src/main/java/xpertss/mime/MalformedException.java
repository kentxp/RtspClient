/**
 * Copyright XpertSoftware All rights reserved.
 *
 * Date: 3/21/11 11:09 AM
 */
package xpertss.mime;

/**
 * Thrown to indicate that a header was Malformed and could not be parsed.
 */
public class MalformedException extends RuntimeException {


   /**
    * No message constructor.
    */
   public MalformedException()
   {
      super();
   }

   public MalformedException(String message)
   {
      super(message);
   }

   public MalformedException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public MalformedException(Throwable cause)
   {
      super(cause);
   }
}
