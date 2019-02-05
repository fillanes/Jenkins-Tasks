#!/bin/env groovy

def call(String name = 'human') {

    //Simple sample
    echo "Job: '${env.JOB_NAME}' [${env.BUILD_NUMBER}]"
    echo "Git User: '${env.GIT_AUTHOR_NAME}' [${env.GIT_COMMITTER_EMAIL}]"  
    echo "Hello, ${name}"
}