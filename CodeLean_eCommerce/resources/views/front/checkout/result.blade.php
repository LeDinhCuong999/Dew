@extends('front.layout.master')

@section('title','Check Out')

@section('body')

    {{--Breadcrumb Section Begin--}}
    <div class="breadcrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text product-more">
                        <a href="./index"><i class="fa fa-home"></i>Home</a>
                        <a href="./checkout">Shop</a>
                        <span>Result</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    {{--Breadcrumb Section End--}}

    {{--Section Begin--}}
    <section class="checkout-section spad">
        <div class="container">
            <div class="col-lg-12">
                <h4>{{ $notification }}</h4>
            </div>

            <a href="./" class="primary-btn mt-5">Continue shopping</a>
        </div>
    </section>
    {{--Section End--}}

@endsection
