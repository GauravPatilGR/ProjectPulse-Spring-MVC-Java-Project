<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
 

  <title>Homepage</title>

 
</head>

<body>


 
     <%@ include file="headerfile.jsp" %>

    <!-- slider section -->
    <section class="slider_section ">
      <div class="carousel_btn-container">
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="sr-only">Next</span>
        </a>
      </div>
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active">01</li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1">02</li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2">03</li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <div class="container-fluid">
              <div class="row">
                <div class="col-md-5 offset-md-1">
                  <div class="detail-box">
                    <h1>
                     You Can <br>
                      Hire Freelancer <br>
                      Here
                    </h1>
                    <c:forEach  items="${kk}" var="e">
                    <p>WELCOME  ${e.name} </p>
                  
                   </c:forEach>
                   
                    <div class="btn-box">
                      <a href="postjob" class="btn-1">
                    Post Job <i class="fa-solid fa-angles-right"></i>
                      </a>
                        <a href="projectform" class="btn-2">
                       Post Project  <i class="fa-solid fa-briefcase"></i>
                       </a>
                     
                    </div>
                  </div>
                </div>
                <div class="offset-md-1 col-md-4 img-container">
                  <div class="img-box">
                    <img src="./files/images/slider-img.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item ">
            <div class="container-fluid">
              <div class="row">
                <div class="col-md-5 offset-md-1">
                  <div class="detail-box">
                    <h1>
                      You Can <br>
                      Hire Freelancer <br>
                      Here
                    </h1>
                    <c:forEach  items="${kk}" var="e">
                    <p>WELCOME  ${e.name} </p>
                  
                   </c:forEach>
                    <div class="btn-box">
                      <a href="postjob" class="btn-1">
                          Post Job <i class="fa-solid fa-angles-right"></i>
                      </a>
                        <a href="projectform" class="btn-2">
                       Post Project  <i class="fa-solid fa-briefcase"></i>
                       </a>
                     
                    </div>
                  </div>
                </div>
                <div class="offset-md-1 col-md-4 img-container">
                  <div class="img-box">
                    <img src="./files/images/slider-img.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item ">
            <div class="container-fluid">
              <div class="row">
                <div class="col-md-5 offset-md-1">
                  <div class="detail-box">
                    <h1>
                      You Can <br>
                      Hire Freelancer <br>
                      Here
                    </h1>
                    <c:forEach  items="${kk}" var="e">
                    <p>WELCOME  ${e.name} </p>
                  
                   </c:forEach>
                    <div class="btn-box">
                      <a href="postjob" class="btn-1">
                          Post Job  <i class="fa-solid fa-angles-right"></i>
                      </a>
                        <a href="projectform" class="btn-2">
                       Post Project <i class="fa-solid fa-briefcase"></i>
                       </a>
                     
                    </div>
                  </div>
                </div>
                <div class="offset-md-1 col-md-4 img-container">
                  <div class="img-box">
                    <img src="./files/images/slider-img.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>

    </section>
    <!-- end slider section -->
  </div>


 <!-- experience section -->

  <section class="experience_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="col-md-5">
          <div class="img-box">
            <img src="./files/images/experience-img.jpg" alt="">
          </div>
        </div>
        <div class="col-md-7">
          <div class="detail-box">
            <div class="heading_container">
              <h2>
                Best Experinced Freelancer Here
              </h2>
            </div>
            <p>
            Let's collaborate to transform your vision into reality. Partner with a seasoned freelancer who prioritizes professionalism, reliability, and outstanding outcomes. Your project deserves nothing less than the best, and I'm here to deliver precisely that.
            </p>
            <div class="btn-box">
             
              <a href="" class="btn-2">
                Hire
              </a>
            </div>
          </div>
        </div>

      </div>
    </div>
  </section>

  <!-- end experience section -->

  <!-- category section -->

  <section class="category_section layout_padding">
    <div class="container">
      <div class="heading_container">
        <h2>
          Category
        </h2>
      </div>
      <div class="category_container">
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c1.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Design & Arts
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c2.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Web Development
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c3.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              SEO Markting
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c4.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Video Edting
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c5.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Logo Design
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./files/images/c6.png" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Game Design
            </h5>
          </div>
        </div>
      </div>
    </div>
  </section>


  <!-- end category section -->

  <!-- about section -->

  <section class="about_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="col-md-10 col-lg-9 mx-auto">
          <div class="img-box">
            <img src="./files/images/about-img.jpg" alt="">
          </div>
        </div>
      </div>
      <div class="detail-box">
        <h2>
          About ProjectPulse Company
        </h2>
        <p>
          Welcome to ProjectPulse, where freelance talent meets exceptional projects!

At ProjectPulse, we're passionate about connecting businesses with top-tier freelancers to bring their projects to life. With a wealth of experience in the freelancing industry, we understand the challenges and opportunities that come with finding the perfect match for your project needs.

Our mission is simple: to provide a platform where clients can access a diverse pool of skilled freelancers, and freelancers can showcase their expertise and find rewarding opportunities. Whether you're a business in need of specialized talent or a freelancer seeking exciting projects, ProjectPulse is your go-to destination.
       
      </div>
    </div>
  </section>

  <!-- end about section -->

  <!-- freelance section -->

  <section class="freelance_section ">
    <div id="accordion">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-5 offset-md-1">
            <div class="detail-box">
              <div class="heading_container">
                <h2>
                  Work Freelaner Has Done
                </h2>
              </div>
              <div class="tab_container">
                <div class="t-link-box" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                  <div class="img-box">
                    <img src="./files/images/f1.png" alt="">
                  </div>
                  <div class="detail-box">
                    <h5>
                      $250 Million
                    </h5>
                    <h3>
                      Paid to Freelancers
                    </h3>
                  </div>
                </div>
                <div class="t-link-box collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                  <div class="img-box">
                    <img src="./files/images/f2.png" alt="">
                  </div>
                  <div class="detail-box">
                    <h5>
                      2 Million
                    </h5>
                    <h3>
                      Paid Invoices
                    </h3>
                  </div>
                </div>
                <div class="t-link-box collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                  <div class="img-box">
                    <img src="./files/images/f3.png" alt="">
                  </div>
                  <div class="detail-box">
                    <h5>
                      700,000
                    </h5>
                    <h3>
                      Worldwide Freelancer
                    </h3>
                  </div>
                </div>
                <div class="t-link-box collapsed" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                  <div class="img-box">
                    <img src="./files/images/f4.png" alt="">
                  </div>
                  <div class="detail-box">
                    <h5>
                      98%
                    </h5>
                    <h3>
                      Customer <br>
                      Satisfaction Rate
                    </h3>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6">
            <div class="collapse show" id="collapseOne" aria-labelledby="headingOne" data-parent="#accordion">
              <div class="img-box">
                <img src="./files/images/freelance-img.jpg" alt="">
              </div>
            </div>
            <div class="collapse" id="collapseTwo" aria-labelledby="headingTwo" data-parent="#accordion">
              <div class="img-box">
                <img src="./files/images/freelance-img.jpg" alt="">
              </div>
            </div>
            <div class="collapse" id="collapseThree" aria-labelledby="headingThree" data-parent="#accordion">
              <div class="img-box">
                <img src="./files/images/freelance-img.jpg" alt="">
              </div>
            </div>
            <div class="collapse" id="collapseFour" aria-labelledby="headingfour" data-parent="#accordion">
              <div class="img-box">
                <img src="./files/images/freelance-img.jpg" alt="">
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end freelance section -->

  <!-- client section -->

  <section class="client_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="col-lg-9 col-md-10 mx-auto">
          <div class="heading_container">
            <h2>
              Testimonial
            </h2>
          </div>
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <div class="detail-box">
                  <h4>
                   Gaurav Patil
                  </h4>
                  <p>
                    This is Best Platform for Freelancer Where they can earn money through freelancing and get unlimited opprtunity to work on Sereval Project
                  </p>
                  <img src="./files/images/quote.png" alt="">
                </div>
              </div>
              <div class="carousel-item">
                <div class="detail-box">
                  <h4>
                   Rohit Waghmare
                  </h4>
                  <p>
                  Their platform is user-friendly, their team is responsive and professional, and their commitment to quality is unmatched. Thanks to ProjectPulse, we were able to find the perfect freelancer for our project, and the results exceeded our expectations. 
                  </p>
                  <img src="./files/images/quote.png" alt="">
                </div>
              </div>
              <div class="carousel-item">
                <div class="detail-box">
                  <h4>
                   Vaibhav Barde
                  </h4>
                  <p>
                  The platform is intuitive, making it simple to browse profiles, communicate with freelancers, and manage projects. We've been consistently impressed with the quality of talent available on ProjectPulse, and the level of professionalism exhibited by both the freelancers and the ProjectPulse team.
                  </p>
                  <img src="./files/images/quote.png" alt="">
                </div>
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end client section -->

  <!-- end client section -->



  <!-- Footer section Start -->
  
   <%@ include file="footerfile.jsp" %>

  <!-- Footer Section end -->

</body>
</body>

</html>