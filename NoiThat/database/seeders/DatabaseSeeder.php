<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

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

        DB::table('NoiThat')->insert([
            [
                'name' => 'giuong ngu',
                'price' => 923.000,
                'image' => 'giuong ngu.jpg',
            ],
            [
                'name' => 'tu quan ao',
                'price' => 723.000,
                'image' => 'tu quan ao.jpg',
            ],
            [
                'name' => 'ghe sofa',
                'price' => 896.000,
                'image' => 'ghe sofa.jpg',
            ],
            [
                'name' => 'tu tivi',
                'price' => 623.000,
                'image' => 'tu tivi.jpg',
            ],
        ]);
    }
}
