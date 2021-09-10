-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 10, 2021 at 08:01 AM
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
-- Database: `noithat`
--

-- --------------------------------------------------------

--
-- Table structure for table `noithat`
--

CREATE TABLE `noithat` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `image` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `noithat`
--

INSERT INTO `noithat` (`id`, `name`, `price`, `image`, `created_at`, `updated_at`) VALUES
(1, 'giuong ngu', 923, 'giuong ngu.jpg', NULL, NULL),
(2, 'tu quan ao', 723, 'tu quan ao.jpg', NULL, NULL),
(3, 'ghe sofa', 896, 'ghe sofa.jpg', NULL, NULL),
(4, 'tu tivi', 623, 'tu tivi.jpg', NULL, NULL),
(5, 'Dew', 345436, 'elnino4.jpg', '2021-09-09 22:51:49', '2021-09-09 22:51:49'),
(6, 'C.Ronaldo sv', 23523532, 'bảnh.jpg', '2021-09-09 22:57:54', '2021-09-09 22:57:54');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `noithat`
--
ALTER TABLE `noithat`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `noithat`
--
ALTER TABLE `noithat`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
