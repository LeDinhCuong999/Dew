<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class NoiThat extends Model
{
    use HasFactory;

    protected $table = 'noithat';
    protected $primaryKey = 'id';
    protected $guarded = [];
}
