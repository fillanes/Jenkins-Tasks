#!/bin/env groovy

def call(String submitterID = 'accountID'){

    def userInput
    try {
        userInput = input(id: 'Proceed1', message: 'Desea pasar a Producción?', submitter: "${submitterID}")
        echo "userInput = [${userInput}]"
    } catch(err) { // input false
        def user = err.getCauses()[0].getUser() 
        echo "Abortado por: [${user}]"
        currentBuild.result = 'ABORTED'
    }
}

