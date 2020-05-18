# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Setup Kubernetes
* Create a service account
  kubectl create serviceaccount stock-api-service-account
* Create a new role called stock-api-service-role:
  kubectl create clusterrole stock-api-service-role --verb=* --resource=deployments,deployments.apps
* Next, assign this new role to your ServiceAccount:
  kubectl create clusterrolebinding stock-api-service-binding --clusterrole=stock-api-service-role --serviceaccount=default:stock-api-service-account