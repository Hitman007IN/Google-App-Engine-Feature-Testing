# Google-App-Engine-Feature-Testing
This project is to test the features of goole cloud app engine

Following are the Queries to be put on test:-

1) Set up Cloud Tools for Eclipse and also install Cloud SDK
2) How to create, test and deploy application to Google App Engine platform
  a) Standard
  b) Flexible
3) How to delete an application deployed on App Engine
4) Does a normal jar or war can be deployed to App Engine
5) App Engine Standard Vs Flexible - as per code and deployment
5) Advantage of App Engine
6) Limitations of App Engine

# Set up Cloud Tools for Eclipse and also install Cloud SDK

a) Install Plugin from Eclipse MarketPlace
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/cloud%20tools%20for%20eclipse%20installation%20as%20plugin.png)

b) Create App engine project using cloud tools
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/cloud%20tools%20create%20app%20engine%20project.png)

c) Cloud SDK installation directory
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/google%20sdk%20installation%20dirctory.png)

d) Initializing SDK with gcloud command
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/gcloud%20init%20with%20google%20sdk.png)

e) gsutil command to connect to Google Cloud Storage
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/gsutil%20with%20google%20sdk.png)

f) To install Additional components apart from gcloud, gsutil, bq
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/additional%20component%20to%20install%20in%20sdk.png)

g) App Engine Component installation
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/installing%20app%20engine%20to%20run%20in%20local%20with%20cloud%20tools.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/installing%20app%20engine%20compoent%20for%20java.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/app%20engine%20component%20installition%20done.png)

h) While runnning application in App Engine local server, need to specify Cloud SDK in eclipse for Cloud Tools to recognize and use tools of app engine installed in sdk in above step
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/setUp/google%20cloud%20tools%20plugin%20recognizes%20app%20engine%20sdk%20to%20run%20application%20in%20local.png)

# How to create, test and deploy application to Google App Engine platform - Standard

a) Deployed application on to app engine local server
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/deploying%20application%20to%20app%20engine%20server%20locally.png)

b) Deploying application to Google App engine in cloud
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/eclipse%20console%20deploying%20to%20app%20engine%20standard.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/deploy%20application%20to%20GCP%20app%20engine%20by%20signinig%20in%20to%20GCP%20and%20selecting%20project.png)

c) App engine mandatory requiremnets for an application to be eligible for deploying to google cloud app engine
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/appengine-web.xml%20%20a%20mandatory%20file%20to%20recognize%20as%20an%20app%20engine%20compatible.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/app%20engine%20facet%20a%20mandatory%20feature%20to%20recognize%20it%20as%20an%20app%20engine%20compatible.png)

d) After deploying to App engine - view of App engine dashboard in GCP
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/app%20engine%20dashboard%20with%20the%20application%20details%20-%20page1.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/app%20engine%20dashboard%20with%20the%20application%20details%20-%20page2.png)

e) Application publically accessible
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/public%20access%20to%20the%20web%20page.png)

# App Engine Standard Vs Flexible - as per code and deployment

a) Standard contains appengine-web.xml and Fexible constains app.yaml
b) Runtime version is specified in Standard but not in Flexible
c) We can run Standard application in App Engine local server, while Flexible has no option to run in local App server, need to deploy in Jetty or Tomcat


# Limitations of App Engine

a) There is no option to delete an application already deployed to App Engine. Though we can disable it.<br />
b) There is a limit for the number of app that a developer can deploy to App Engine. Count has increased from 3 to 10<br />
c) No ways to change the zone or region once deployed.<br />

https://stackoverflow.com/questions/42512/deleting-a-google-app-engine-application
Issue is raised in Google Issue Tracker - https://issuetracker.google.com/issues/35874988
