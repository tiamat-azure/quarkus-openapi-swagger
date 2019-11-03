# Guide

Official guide here : https://quarkus.io/guides/openapi-swaggerui-guide

# Step by step

Initialize the project :

    mvn io.quarkus:quarkus-maven-plugin:0.27.0:create \
        -DprojectGroupId=nc.opt \
        -DprojectArtifactId=quarkus-openapi-swagger \
        -DclassName="nc.opt.openapi.FruitResource" \
        -Dpath="/fruits" \
        -Dextensions="resteasy-jsonb" \


Compile :

    mvn compile quarkus:dev

Test the application landing page : http://localhost:8080
![quarkus-landing-page](images/quarkus-landing-page.jpg)