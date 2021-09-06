<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        // \App\Models\User::factory(10)->create();

        DB::table('lists')->insert([
            [
                'cmnd' => '12345678900',
                'hovaten' => 'Kim Jong Un',
                'ngaythangnamsinh' => '32/02/1969',
                'diachi' => 'Fukec',
                'sdt' => '1236502465',
                'tiensudiung' => 'khong co',
            ],
            [
                'cmnd' => '12345678900',
                'hovaten' => 'Donal Trump',
                'ngaythangnamsinh' => '33/02/1969',
                'diachi' => 'Fukec',
                'sdt' => '1236502465',
                'tiensudiung' => 'khong co',
            ],
            [
                'cmnd' => '12345678900',
                'hovaten' => 'Tap Can Binh',
                'ngaythangnamsinh' => '34/02/1969',
                'diachi' => 'Fukec',
                'sdt' => '1236502465',
                'tiensudiung' => 'khong co',
            ]
        ]);
    }
}
