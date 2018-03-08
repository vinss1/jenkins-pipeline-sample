#!/bin/groovy

def execute() {
  // Read the pipeline input from a YAML file
  // And use the data there to inform all the stages below
  pipeline {
    agent any
    stages {
  
      stage('Unit Tests') {
        // Build and push Docker image for unit tests
        // Run Docker container
        // Log the container execution output to Jenkins
      }

      stage('Parallel Tests') {
        parallel {
        
          stage('Functional Tests') {
            // Build and push Docker image for functional tests
            // Create feature environment (Kube namespace) for isolated testing
            // Deploy and run the Docker container in the feature env
            // Log the container execution output to Jenkins
          }
          
          stage('Coverage Tests') {
            // Build and push Docker image for coverage tests
            // Run the Docker container
            // Log the container execution output to Jenkins
          }
          
          stage('Security Tests') {
            // Build and push Docker image for security tests
            // Run the Docker container
            // Log the container execution output to Jenkins
          }
        }
        
        stage('Performance Tests') {
          // Build and push Docker image for performance tests
          // Deploy and run the Docker container(s) in the feature env
          // Run the Docker container
          // Log the container execution output to Jenkins
        }
        
        stage('Version Release') {
          // Calculate new version
          // Tag and push
          // Deploy and run the Docker container(s) in the production env
        }

      }
      
    }
    
  }
  
}
