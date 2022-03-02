<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/18/2022
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
  </head>
  <body>
  <a href="/customer"></a>
  <nav style="background: #0c5460">
    <div class="nav nav-tabs" id="nav-tab" role="tablist">
      <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Home</a>
      <a class="nav-item nav-link" id="nav-profile-tab"  href="/employee" >Employee</a>
      <a class="nav-item nav-link" id="nav-customer-tab" href="/customer">Customer</a>
      <a class="nav-item nav-link" id="nav-service-tab" href="/service" >Service</a>
    </div>
  </nav>

  <div class="tab-content" id="nav-tabContent">
    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">...</div>
    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...</div>
    <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...</div>
  </div>

  <div class="container-fluid">
    <div>
      <img src="https://assets.hotelplan.com/content/HP/00/071/443/hotel/fr/lightbox/376365.jpg" alt="" width="100%" height="50%">
    </div>



    <div class="container">
        <div class="row">
          <div class="col-5" >
           <table style="border: 1px solid #1e7e34">
            <p style="color: #856404 ; font-weight: 800">
              THIS WORLD CLASS RESORT, FURAMA DANANG, REPUTABLE AS THE CULINARY BEACH RESORT IN VIETNAM
            </p>
             <p style="font-weight: 600">
               Overlooking the long stretch of wide white sand on Danang Beach,
               Furama Resort Danang is a gateway to three World Heritage Sites of Hoi An (20 minutes),
               My Son (90 minutes) and Hue (2 hours). The 196 rooms and suites plus 70 two to four bedroom pool villas
               feature tasteful décor, designed with traditional Vietnamese style and a touch of French colonial architecture
               and guarantee the Vietnam’s the most prestigious resort -counting royalty, presidents,
               movie stars and international business leaders among its celebrity guests.
             </p>

             <img src="https://images.trvl-media.com/hotels/2000000/1780000/1773100/1773032/3cf61452_z.jpg" alt=""width="100%" height="30%">
             <a href=""><p>Furama Resort</p></a>

             <img src="https://singapore-travel.com/wp-content/uploads/2019/05/Furama-City-Centre-Singapore-10-1024x683.jpg" alt="" width="50%" height="15%">
             <img src="https://images.trvl-media.com/hotels/2000000/1780000/1773100/1773032/36e49eaf_z.jpg" alt="" width="50%" height="15%">
           </table>
          </div>

          <div class="col-5" >
            <table style="border: 1px solid #1e7e34">
              <iframe width="560" height="315" src="https://www.youtube.com/embed/Pa8tN0u0Rr0"
                      title="YouTube video player" frameborder="0" allow="accelerometer; autoplay;
                      clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                      allowfullscreen></iframe>
              <p style="font-weight: 600">
                The resort’s culinary experience features a mixture of authentic and locally inspired Vietnamese,
                Asian, Italian, and other European cuisines plus the best-imported steaks. The resort presents guests
                with varied gastronomic venues – the hip and breezy bar overlooking the beach, the exclusive Lagoon pool
                surrounded by a tropical garden, the true Italian flare offered at the Don Cipriani’s, the refined Asian
                touch at Café Indochine, or the authentic central Vietnam cuisine at the Danaksara. Furama Resort Danang also
                impresses and amuses guests with various fun and exciting programs such as excursions,
                water sports, diving, and golf as well as health and beauty services.
              </p>
              <p style="font-weight: 600">
                With the prime location near the center of Da Nang and convenient international connection to
                Singapore, Bangkok, Siem Reap, Kuala Lumpur, Taiwan, Tokyo, Osaka, Seoul, Busan, Hong Kong – Macau,
                and China including Beijing, Shanghai, Hangzhou, Guangzhou, Chengdu… by direct flights, Furama Resort
                Danang is the ideal venue for travel agents, enterprises, event organizations. A well-appointed Convention
                Palace can accommodate up to 3,000 people in style, with another ten function rooms for 50 to 300 people.
                Ariyana Convention Centre (ACC) has been built to host the APEC 2017 and connected with Furama Danang’s International
                Convention Palace (ICP)
                to make it the largest of its kind in Vietnam that can accommodate up to 5,000 guests.
              </p>

              <p style="font-weight: 600">
                A variety of cultural-themed parties on the beach or around the lagoon, in the ballrooms or outside the resort,
                with the surprising arrivals of VIPs from a Helicopter landing on the resort’s own Helipad, plus exciting team
                building activities and water sports, pioneering international-standard scuba diving – “Diving Base”, two 18-hole
                golf courses nearby
                , as well as health and beauty service, make the Furama Danang the ideal venue for MICE groups.
              </p>

            </table>
          </div>

        </div>
    </div>
  </div>



  <div style="background: #0c5460">
          <h5 style="text-align: center">@C1021G1</h5>
  </div>



  <script src="/assert/jquery/jquery-3.5.1.min.js"></script>
  <script src="/assert/bootstrap413/js/popper.min.js"></script>
  <script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
  <script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
  <script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
  <script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
  </body>
</html>
