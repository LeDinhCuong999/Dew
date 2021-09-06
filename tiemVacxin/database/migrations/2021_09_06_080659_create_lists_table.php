<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateListsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('lists', function (Blueprint $table) {
            $table->id();

            $table->string('số cmnd/cccd');
            $table->string('họ và tên');
            $table->string('ngày tháng năm sinh');
            $table->string('địa chỉ');
            $table->string('số điện thoại');
            $table->string('tiền sử dị ứng');

            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('lists');
    }
}
