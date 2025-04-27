node {
    stage('Pull') {
        echo 'Your code pull is complete'
    }
    stage('Build') {
        echo 'Your code build Successfull'
    }
    stage('Test') {
        echo 'Your Application is successfully tested'
    }
    stage('Deploy') {
        echo 'YAAHUU..!, Your Application is deployed On Production Server'
    }
}