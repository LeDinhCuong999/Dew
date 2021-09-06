-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 06, 2021 at 06:09 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiem_vacxin`
--

-- --------------------------------------------------------

--
-- Table structure for table `lists`
--

CREATE TABLE `lists` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `cmnd` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hovaten` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaythangnamsinh` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diachi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sdt` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tiensudiung` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `lists`
--

INSERT INTO `lists` (`id`, `cmnd`, `hovaten`, `ngaythangnamsinh`, `diachi`, `sdt`, `tiensudiung`, `created_at`, `updated_at`) VALUES
(1, '12345678900', 'Kim Jong Un', '32/02/1969', 'Fukec', '1236502465', 'khong co', NULL, NULL),
(3, '12345678901', 'Donal Trump', '31/02/1969', 'Fukec', '2548798745', 'khong co', NULL, NULL),
(4, '12345678902', 'Tap Can Binh', '33/02/1969', 'Fukec', '1254796548', 'khong co', NULL, NULL),
(5, '12345678900', 'Kim Jong Un', '32/02/1969', 'Fukec', '1236502465', 'khong co', NULL, NULL),
(6, '12345678900', 'Donal Trump', '33/02/1969', 'Fukec', '1236502465', 'khong co', NULL, NULL),
(7, '12345678900', 'Tap Can Binh', '34/02/1969', 'Fukec', '1236502465', 'khong co', NULL, NULL),
(8, '64161', 'Barack Obama', '2021-09-16', 'Đông Lào', '938534', 'không', NULL, NULL),
(9, '4481', 'Elizabeth', '2021-09-17', 'Brazil', '6402494', 'f2', '2021-09-06 04:28:54', '2021-09-06 04:28:54'),
(10, '849661', 'Fidel Castro', '2021-09-16', 'Olimpus', '9844941', 'f1', '2021-09-06 07:20:43', '2021-09-06 07:20:43');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lists`
--
ALTER TABLE `lists`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lists`
--
ALTER TABLE `lists`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
