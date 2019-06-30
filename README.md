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

e) Configuration of One of the version deployed
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/Configuration%20of%20one%20of%20the%20versions%20of%20App%20deployed%20in%20Standard%20App%20Engine.png)

f) Application publically accessible
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/standardAppEngine/public%20access%20to%20the%20web%20page.png)

# How to create, test and deploy application to Google App Engine platform - Flexible

App Engine Flexible Deployment using Eclipse - https://cloud.google.com/eclipse/docs/deploy-flex

a) Before deploying to cloud enable Flexible App Engine API
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Enable%20Flexible%20App%20Engine%20API%20before%20deploying.png)

b) Add flexible App Engine facet to recognize it by Google cloud App Engine
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Prerequisite%20to%20add%20facet%20as%20flexible%20App%20engine%20before%20deploying%20to%20App%20Engine%20Cloud.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Enabled%20App%20Engine%20Flexible%20API.png)

c) Deploying to Google Cloud App Engine
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Deploying%20to%20App%20Engine%20Cloud.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/console%20log%20while%20deploying%20to%20App%20Engine.png)

d) Configuration of One of the version deployed
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Configuration%20of%20one%20of%20the%20versions%20of%20App%20deployed%20in%20Flexible%20App%20Engine.png)

e) Deployed on cloud Accessible publically
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/flexibleAppEngine/Flexible%20Application%20deployed%20publically%20accessible.png)

# App Engine Standard Vs Flexible - as per code and deployment

Project Structure:-
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/project%20structure%20difference.png)

a) Standard contains appengine-web.xml and Fexible constains app.yaml
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/standard%20contains%20appengine-web.xml%20file.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/flexible%20app.yaml%20file.png)

b) Runtime version is specified in Standard but not in Flexible
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/standard%20contains%20appengine-web.xml%20file.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/flexible%20app.yaml%20file.png)

c) We can run Standard application in App Engine local server, while Flexible has no option to run in local App server, need to deploy in Jetty or Tomcat
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/Run%20As%20for%20standard%20as%20App%20Engine%20server.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/Flexible%20cannot%20be%20deployed%20on%20local%20App%20engine%20server.png)

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/comparision/Flexible%20has%20no%20app%20engine%20server.png)

# Limitations of App Engine

a) There is no option to delete a default application/version already deployed to App Engine. Though we can disable either entire App Engine belonging to that project or stop/delete the serving instance versions.<br />
https://stackoverflow.com/questions/42512/deleting-a-google-app-engine-application <br />

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/disable%20App%20Engine%20for%20Entire%20Project%20-%20part1.png)
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/disable%20App%20Engine%20for%20Entire%20Project%20-%20part2.png)
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/stop%20and%20start%20an%20instance.png)

# RESOLVED - Applications other than Default one can be deleted

b) There is a limit for the number of app that a developer can deploy to App Engine. Count has increased from 3 to 10<br />
Issue is raised in Google Issue Tracker - https://issuetracker.google.com/issues/35874988 <br />
c) No ways to change the zone or region once deployed.<br />
d) We can see the versions of Application deployed on App Engine and the environment as Flexible and Standard. But, when the number of application increases, it will be a lot difficult to manage these. 
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/Versions%20of%20application%20deployed%20on%20App%20Engine.png)

e) You can deploy only one application to App Engine of a project. There is concept of services, where you can deploy multiple service in App Engine and these services code cannot communicate to each other, other than REST call. <br />
https://stackoverflow.com/questions/46036320/deploy-multiple-applications-from-same-project <br />
https://stackoverflow.com/questions/29302717/is-there-possibility-to-host-multiple-applications-with-google-app-engine <br />
https://cloud.google.com/appengine/docs/standard/python/microservices-on-app-engine <br />

![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/deployed%20multiple%20versions%20of%20application.png)
![alt text](https://github.com/Hitman007IN/Google-App-Engine-Feature-Testing/blob/master/screenshots/limitations/new%20application%20has%20new%20URL.png)

f) Standard App Engine supports only a war and not jar
e) There is a size limit of 32MB in a single file that can be depoyed on App Engine
https://stackoverflow.com/questions/53683410/greater-than-maximum-allowed-size-of-33554432-in-google-cloud-platform
https://cloud.google.com/appengine/quotas

