#!/usr/bin/env groovy
def call(CONTAINER,IMAGE){
    stage('docker deploy'){
        sh 'docker run -d --name ${CONTAINER} ${IMAGE}'
    }
}
return [
    call: this.&call
]