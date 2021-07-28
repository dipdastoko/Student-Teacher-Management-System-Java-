
package mypack;

class InvalidOptionException extends RuntimeException{

  InvalidOptionException(){
super("Invalid Option. You must choose 1 or 2");
  }

}