-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 05, 2023 at 12:35 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sorted_billing`
--

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `id` int(11) NOT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`id`, `fname`, `lname`, `phoneno`, `email`, `pass`, `gender`) VALUES
(1, 'asdf', 'asdf', '98ad98989898', 'asdfjasdf@asdf.com', '123', 'Male'),
(19, 'shovjnjaskdnv', '', '9909009887', 'h', '123', 'Male'),
(20, 'shoray', 's', '7889190982', 'j@gmail.com', '123', 'Male'),
(21, 'shoray', 'jk', '7889190982', 'jk@gmail.com', '123', 'Male'),
(22, 'naksh', 'bali', '1234567890', 'abc@gmail.com', '123', 'Male'),
(23, 'Vaibhav ', 'Rawat', '9090909090', 'abc@gmail.com', 'shorayissexy69', 'Male'),
(24, 'hasan', 'pal', '1234567890', 'abc@gmail.com', 'asd', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `signupemp`
--

CREATE TABLE `signupemp` (
  `id` int(11) NOT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `storeid` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signupemp`
--

INSERT INTO `signupemp` (`id`, `fname`, `lname`, `phoneno`, `email`, `storeid`, `pass`, `salary`, `gender`) VALUES
(1, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female'),
(2, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female'),
(3, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female'),
(4, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female'),
(5, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female'),
(6, 'vjwnb', 'ib', 'ibi', 'b', 'ubihbi', '123', 'nuibubu', 'Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `signupemp`
--
ALTER TABLE `signupemp`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `signupemp`
--
ALTER TABLE `signupemp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
