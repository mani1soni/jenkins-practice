#!/usr/bin/env groovy
def call(CONTAINER,IMAGE){
    sh 'docker run -d --name ${CONTAINER} ${IMAGE}'
} 