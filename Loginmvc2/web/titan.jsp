<%-- 
    Document   : titan.jsp
    Created on : Nov 18, 2023, 10:59:00 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="titan.css">
    
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#"><img src="images/TITANlogo.svg" height="50px" width="150px" alt="" class="img-fluid"></a>
          <!-- <a class="navbar-brand" href="#">Navbar scroll</a> -->
          <!-- <img src="images/TITANlogo.svg" height="50px" width="150px" alt=""> -->
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Link
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Link</a>
              </li>
            </ul>
            <form class="d-flex">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>  


      <!-- sgsgsg -->
      <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="images/slide1.avif" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="images/slide2.avif" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="images/slide3.avif" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="images/slide4.avif" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="images/slide5.avif" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="images/slide6.avif" class="d-block w-100" alt="...">
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
      <!-- shhshs -->
      
      
      <section class="container-fluid">
        <div class="row mt-4 py-3">
          <div class="col-12 d-flex flex-column text-center justify-content-center">
            <h2>Top Sellers</h2>
          </div>
          <div class="row mt-5 mx-0 justify-content-center align-items-center">
            <div class="col-lg-3 col-md-4 col-12 card-wrapper">
              <div class="card mt-4">
                <img src="images/product1.webp" class="img-fluid" alt="portfolio-img">
                <div class="card-body text-center">
                  <h6 class="card-title">E-commerce Website</h6>
                  <p class="card-text text-secondary">HTML/CSS/JavaScript</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/product2.webp" class="img-fluid" alt="portfolio-img">
                <div class="card-body text-center">
                  <h6 class="card-title">DIAMOND</h6>
                  <p class="card-text text-secondary">FUNGISITE</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/product3.webp" class="img-fluid" alt="product-img">
                <div class="card-body text-center">
                  <h6 class="card-title">DELFOZIN</h6>
                  <p class="card-text text-secondary">FUNGISITE</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/product4.webp" class="img-fluid" alt="product-img">
                <div class="card-body text-center">
                  <h6 class="card-title">PETTA-GOLD</h6>
                  <p class="card-text text-secondary">plant-growth-promoter</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
          </div>
        </div>
    </section>   
    <section class="container-fluid">
        <div class="row mt-4 py-3">
          <div class="col-12 d-flex flex-column text-center justify-content-center">
            <h2>Trending Products</h2>
          </div>
          <div class="row mt-5 mx-0 justify-content-center align-items-center">
            <div class="col-lg-3 col-md-4 col-12 card-wrapper">
              <div class="card mt-4">
                <img src="images/productsecondrow1.webp" class="img-fluid" alt="portfolio-img">
                <div class="card-body text-center">
                  <h6 class="card-title">E-commerce Website</h6>
                  <p class="card-text text-secondary">HTML/CSS/JavaScript</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/productsecondrow2.webp" class="img-fluid" alt="portfolio-img">
                <div class="card-body text-center">
                  <h6 class="card-title">DIAMOND</h6>
                  <p class="card-text text-secondary">FUNGISITE</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/productsecondrow3.webp" class="img-fluid" alt="product-img">
                <div class="card-body text-center">
                  <h6 class="card-title">DELFOZIN</h6>
                  <p class="card-text text-secondary">FUNGISITE</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-4 card-wrapper">
              <div class="card mt-4">
                <img src="images/productsecondrow4.webp" class="img-fluid" alt="product-img">
                <div class="card-body text-center">
                  <h6 class="card-title">PETTA-GOLD</h6>
                  <p class="card-text text-secondary">plant-growth-promoter</p>
                  <a href="#" class="btn btn-danger text-center">Add to card</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- hdhdhd -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3 col-sm-6 col-xs-6 mb-2 mt-5">
                    <img src="images/image1.webp" alt=""  class="img-fluid">
                </div>
                <div class="col-md-3 col-sm-6 col-xs-6 mb-2 mt-5" height="200px" width="300px">
                    <img src="images/image2.webp" alt=""  class="img-fluid">
                </div>
                <div class="col-md-3 col-sm-6 col-xs-6 mb-2  mt-5" height="200px" width="300px">
                    <img src="images/image3.webp" alt=""  class="img-fluid">
                </div>
                <div class="col-md-3 col-sm-6 col-xs-6 mb-2  mt-5" >
                    <img src="images/image4.webp" alt="" class="img-fluid">
                </div>
            </div>
           
            </div>
       </div>
        <!-- jdjdjd -->
    </section>    
      <!-- sgsggsgs -->
      <div>
        <img src="https://www.titan.co.in/shop/wall-clocks?cm_sp=homepage-_-wallclock-_-wallclockplp"  class="img-fluid">
    </div>
     <section class="container-fluid">
        <div class="row mt-4 py-3">
            <div class="col-12 d-flex flex-column text-center justify-content-center">
              <h2>Trending Products</h2>
            </div>
            <div class="row mt-5 mx-0 justify-content-center align-items-center">
              <div class="col-lg-3 col-md-4 col-12 card-wrapper">
                <div class="card mt-4">
                  <img src="images/productsecondrow1.webp" class="img-fluid" alt="portfolio-img">
                  <div class="card-body text-center">
                    <h6 class="card-title">E-commerce Website</h6>
                    <p class="card-text text-secondary">HTML/CSS/JavaScript</p>
                    <a href="#" class="btn btn-danger text-center">Add to card</a>
                  </div>
                </div>
              </div>
              <div class="col-lg-3 col-md-4 card-wrapper">
                <div class="card mt-4">
                  <img src="images/productsecondrow2.webp" class="img-fluid" alt="portfolio-img">
                  <div class="card-body text-center">
                    <h6 class="card-title">DIAMOND</h6>
                    <p class="card-text text-secondary">FUNGISITE</p>
                    <a href="#" class="btn btn-danger text-center">Add to card</a>
                  </div>
                </div>
              </div>
              <div class="col-lg-3 col-md-4 card-wrapper">
                <div class="card mt-4">
                  <img src="images/productsecondrow3.webp" class="img-fluid" alt="product-img">
                  <div class="card-body text-center">
                    <h6 class="card-title">DELFOZIN</h6>
                    <p class="card-text text-secondary">FUNGISITE</p>
                    <a href="#" class="btn btn-danger text-center">Add to card</a>
                  </div>
                </div>
              </div>
              <div class="col-lg-3 col-md-4 card-wrapper">
                <div class="card mt-4">
                  <img src="images/productsecondrow4.webp" class="img-fluid" alt="product-img">
                  <div class="card-body text-center">
                    <h6 class="card-title">PETTA-GOLD</h6>
                    <p class="card-text text-secondary">plant-growth-promoter</p>
                    <a href="#" class="btn btn-danger text-center">Add to card</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
     </section>
      <!-- bcbccb -->
      <div>
        <img src="images/video.gif"  class="img-fluid">
    </div>
      <!-- hfhfh -->
       <!-- footer -->
    <!-- Remove the container if you want to extend the Footer to full width. -->
<div class="mt-5">
  <!-- Footer -->
  <footer
          class="text-center text-lg-start text-white"
          style="background-color: #3e4551"
          >
    <!-- Grid container -->
    <div class="container p-4 pb-0">
      <!-- Section: Links -->
      <section class="">
        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">FOOTER CONTENT</h5>

            <p>
              Lorem ipsum dolor sit amet consectetur adipisicing elit.
              Molestiae modi cum ipsam ad, illo possimus laborum ut
              reiciendis obcaecati. Ducimus, quas. Corrupti, pariatur eaque?
              Reiciendis assumenda iusto sapiente inventore animi?
            </p>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-2 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">Links</h5>

            <ul class="list-unstyled mb-0">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-2 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">Links</h5>

            <ul class="list-unstyled mb-0">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-2 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">Links</h5>

            <ul class="list-unstyled mb-0">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-2 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">Links</h5>

            <ul class="list-unstyled mb-0">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </section>
      <!-- Section: Links -->

      <hr class="mb-4" />

      <!-- Section: CTA -->
      <section class="">
        <p class="d-flex justify-content-center align-items-center">
          <span class="me-3">Register for free</span>
          <button type="button" class="btn btn-outline-light btn-rounded">
            Sign up!
          </button>
        </p>
      </section>
      <!-- Section: CTA -->

      <hr class="mb-4" />

      <!-- Section: Social media -->
      <section class="mb-4 text-center">
        <!-- Facebook -->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-facebook-f"></i
          ></a>

        <!-- Twitter -->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-twitter"></i
          ></a>

        <!-- Google -->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-google"></i
          ></a>

        <!-- Instagram -->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-instagram"></i
          ></a>

        <!-- Linkedin -->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-linkedin-in"></i
          ></a>

        <!--Github-->
        <a
           class="btn btn-outline-light btn-floating m-1"
           href="#!"
           role="button"
           ><i class="fab fa-github"></i
          ></a>
      </section>
      <!-- Section: Social media -->
    </div>
    <!-- Grid container -->

    
    <!-- Copyright -->
    
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2)">
      © 2020 Copyright:
      <a class="text-white" href="titan3.html">Uday Mourya</a>
    </div>
    <!-- Copyright -->
  </footer>
  <!-- Footer -->
</div>
<!-- End of .container -->
</body>
</html>
