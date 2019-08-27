#!/usr/bin/env groovy
def call(){
   sh 'sudo docker run -itd --name test ubuntu'
}
return this

//class docker {
  //  def first(){
    //   echo 'hello'
   //}
//}
//return new docker();



