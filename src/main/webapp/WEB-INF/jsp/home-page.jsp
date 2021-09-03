<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="/static/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/static/css/homepage.css" rel="stylesheet">

<nav class="navbar navbar-expand-sm navbar-light bg-white border-bottom">
<a class="navbar-brand ml-2 font-weight-bold" href="#"><span id="orange">Kharkiv tools</span></a>
</nav>

<!-- Sidebar filter section -->
<section id="sidebar">
    <div class="border-bottom pb-2 ml-2">
        <h4 id="burgundy">

        </h4>
    </div>

    <div class="border-bottom pb-2 ml-2">
        <h4 id="burgundy">Filters</h4>
    </div>
    <div class="py-2 border-bottom ml-3">
        <h5 id="burgundy">Categories</h5>
        <form>
            <div class="form-group"> <input type="checkbox" id="electronic"> <label for="electronic">Electronic tools</label> </div>
            <div class="form-group"> <input type="checkbox" id="battery"> <label for="battery">Battery tools</label> </div>
            <div class="form-group"> <input type="checkbox" id="ladders"> <label for="ladders">Ladders</label> </div>
            <div class="form-group"> <input type="checkbox" id="hand"> <label for="hand">Hand tools</label> </div>
            <div class="form-group"> <input type="checkbox" id="consumables"> <label for="consumables">Сonsumables</label> </div>
        </form>
    </div>
</section>

<!-- products section -->
<section id="products">
    <div class="container">
        <div class="d-flex flex-row">
            <div class="text-muted m-2" id="res">Showing 6 results</div>
            <div class="ml-auto mr-lg-4">
                <div id="sorting" class="border rounded p-1 m-1"> <span class="text-muted">Sort by</span> <select name="sort" id="sort">
                        <option value="alphabetic"><b>Alphabetic</b></option>
                        <option value="price"><b>Price</b></option>
                        <option value="date"><b>Date</b></option>
                    </select> </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
            <div class="card">
                 <img class="card-img-top" src="/static/icons/dnipro-m-cd-12q.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h6><b>Screwdriver Dnipro-M CD-12Q</b> </h6>
                        <div class="d-flex flex-row">
                            <div class="text-muted">Prise 550	&#8372</div>
                        </div> <button class="btn w-100 rounded my-2">Add to basket</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <img class="card-img-top" src="https://images.pexels.com/photos/3085146/pexels-photo-3085146.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h5><b>Bagels</b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted">₹35/piece</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1">1 pc</span> <button class="border rounded bg-white sign"><span class="fa fa-minus" id="orange"></span></button> </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <img class="card-img-top" src="https://images.pexels.com/photos/1448665/pexels-photo-1448665.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h5><b>White Bread</b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted">₹80/loaf</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1">1 loaf</span> <button class="border rounded bg-white sign"><span class="fa fa-minus" id="orange"></span></button> </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <img class="card-img-top" src="https://images.pexels.com/photos/461060/pexels-photo-461060.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h5><b>Baguette</b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted">₹160/piece</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1">1 pc</span> <button class="border rounded bg-white sign"><span class="fa fa-minus" id="orange"></span></button> </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <img class="card-img-top" src="https://images.pexels.com/photos/209206/pexels-photo-209206.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h5><b>Masala Bun</b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted">₹85/piece</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1">1 pc</span> <button class="border rounded bg-white sign"><span class="fa fa-minus" id="orange"></span></button> </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card d-relative"> <img class="card-img-top" src="https://images.pexels.com/photos/3570/morning-breakfast-croissant.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                    <div class="card-body">
                        <h5><b>Croissant</b> </h5>
                        <div class="rounded bg-white discount" id="orange">10% off</div>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted price"><del>₹55</del>₹45/piece</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span>1pc</span> <button class="border rounded bg-white sign"><span class="fa fa-minus" id="orange"></span></button> </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>