# spring-boot-react-ecommerce-app
eCommerce application based on the microservices architecture built using Spring Boot and ReactJS.

**DEMO**
- Deployed to Heroku Cloud:

  https://shoppers-ecom-app.herokuapp.com

  **Note:** It is running on a free dyno, so the services go to sleep if not in use.
       For the first time, it may take some time to respond.
 
**FEATURES**

- Google OAuth 2.0 support for quick login. [optional]
- Regular Username/Password authentication.
- Search bar and Search suggestions help to find products quickly.
- Stores user information in the MySQL database.
- Stores API data in Redis Cache to minimize network calls.
- Select filters to display products based on the selections.
- Sort products by popularity, newest, and prices.
- Pagination to display max products on a single page.
- Stores authentication details like token information in cookies.
- Store cart's product information in cookies.
- Payment service using Stripe's API to buy products. [optional]
- Responsiveness support for all devices.

**TOOLS USED**

- **ReactJS:** Front-end Javascript framework.
- **Spring Boot 2.0:** Back-end JAVA framework to build microservices using Spring
 Rest Controller and Spring JPA.
- **Material-UI:** Used Google's material design based on the CSS Framework for a responsive website.
- **Semantic-UI:** Used some components which Material-UI doesn't support.
- **MySQL:** Stores product and user information.
- **Redis:** Stores API data in key-value pairs.
- **Cloudinary:** CDN server for storing product images. 
- **Google OAuth:** 3rd Party authentication service for quick login by retrieving user profile information. 
- **Stripe:** Payment service API to handle user payment requests.
- **Heroku Cloud Platform:** Deploying microservices on Heroku.
- **Docker-Compose:** Easy way to bring up the application using containerization and behaves similarly in the production environment.
 
**MICROSERVICES**

- **React-UI Service:** Front-end client UI which displays data and makes API calls using Axios API.
- **Common Data Service:** Handles client request to provide common data such as product, filters, categories and order information, etc. 
- **Authentication Service:** Creates user account and handles username/password authentication.
- **Payment Service:** Handles payment requests from the client and makes a subsequent request to Stripe API
 for money deduction. 
- **Search Suggestion Service:** Provide default search suggestions and provides suggestions based on a prefix using Hashmap. The service creates the Hashmap based on available data from the database with various combinations and populates the map.

**Steps for executing the application using docker-compose:**
1. Clone/Download the repository.

2. Set the environmental variables which will be impacted on docker-compose.yml.
   
    1. You can check the .env-sample file. Most of the variables are already set.
       You need to rename the file ".env-sample" to ".env".
       <br/><br/>
    2. In addition, You need to create a Stripe account and Google OAuth credentials.
       The application works even if you don't create this account, only the payment and OAuth functionality will not work.
       These accounts doesn't charge you anything and are absolutely free.<br/><br/>

       You need to set below two env variables.<br/><br/>

       REACT_APP_STRIPE_PUBLISH_KEY=<Your Stripe Publishable Key>

       Go [Here](https://dashboard.stripe.com/register) to create a Stripe account.
       <br/><br/>
       REACT_APP_GOOGLE_AUTH_CLIENT_ID=<Your Google AUTH Client ID>

       Go [Here](https://console.developers.google.com) to create Google OAuth Credentials.


3. Set the CORS in the backend service as shown below.
   ```
      go to file on this path => server/common-data-service/src/main/java/com/ujjaval/ecommerce/commondataservice/config/CorsConfig.java
      
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins(<Add your client host URL string here>)
                .allowedMethods("GET", "POST");
      }
   ```

3. Build all the microservices and run the app using docker-compose. This is done using ./start-all.sh script which creates the network and set the container dependencies based on the config mention in the docker-compose.yml. 
   This will build all the jar files and run all the services.
   ```
      ./start-all.sh
   ```

4. If you are making any change in the code then you need to you ./stop-all.sh to clean up the jars created by ./start-all.sh script. Also, you need to remove the images from the docker otherwise it will occupy the image spaces unnecessarily.
   <br/><br/>
   You can check docker images with below command
   ```
      docker images
   ```
   Remove multiple docker images
   ```
      docker images -a | grep -E "ecommerce|none" | awk '{print $3}' | xargs docker rmi -f
   ```

**Payment Service Test Details:**

    Credit card no.: 4242 4242 4242 4242
    Expiry: Any future date
    CVV: Any 3-digit number

Steps to deploy Docker Images on AWS
  1. Push docker images of all microservices to Dockerhub or ECR*
  2. One can setup EC2 instances to deploy each microservice and manage them using Application Load Balancer
  3. Or using Elastic Beanstalk and Docker Compose option
  4. Best is using Elastic Container Services and ECR
  
  References - https://aws.amazon.com/blogs/containers/deploy-applications-on-amazon-ecs-using-docker-compose/
