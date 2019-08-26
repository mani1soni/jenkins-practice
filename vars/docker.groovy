#!/usr/bin/env groovy
def call(){
    sh 'docker run -d --name test ubuntu'   
}
return [
    call: this.&call
]