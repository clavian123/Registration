-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2020 at 02:32 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eventmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` bigint(20) NOT NULL,
  `cif_code` varchar(10) NOT NULL,
  `title` varchar(10) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `id_type` varchar(50) DEFAULT NULL,
  `id_number` varchar(50) DEFAULT NULL,
  `id_expiry_date` datetime DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `marital_status` varchar(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `rt_rw` varchar(10) DEFAULT NULL,
  `kelurahan` varchar(50) DEFAULT NULL,
  `kecamatan` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postal_code` varchar(10) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `current_address` varchar(255) DEFAULT NULL,
  `current_rt_rw` varchar(10) DEFAULT NULL,
  `current_kelurahan` varchar(50) DEFAULT NULL,
  `current_kecamatan` varchar(50) DEFAULT NULL,
  `current_city` varchar(50) DEFAULT NULL,
  `current_postal_code` varchar(10) DEFAULT NULL,
  `current_province` varchar(50) DEFAULT NULL,
  `mothers_maiden` varchar(255) DEFAULT NULL,
  `birth_place` varchar(50) DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `monthly_income` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `mobile_number` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `status` bigint(20) NOT NULL,
  `created_date` datetime NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `last_updated_date` datetime NOT NULL,
  `last_updated_by` varchar(50) NOT NULL,
  `pan` varchar(17) NOT NULL,
  `pin` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `cif_code`, `title`, `name`, `id_type`, `id_number`, `id_expiry_date`, `gender`, `marital_status`, `address`, `rt_rw`, `kelurahan`, `kecamatan`, `city`, `postal_code`, `province`, `current_address`, `current_rt_rw`, `current_kelurahan`, `current_kecamatan`, `current_city`, `current_postal_code`, `current_province`, `mothers_maiden`, `birth_place`, `birth_date`, `occupation`, `monthly_income`, `email`, `mobile_number`, `nationality`, `status`, `created_date`, `created_by`, `last_updated_date`, `last_updated_by`, `pan`, `pin`) VALUES
(1, '1234567890', 'Mr', 'Tantono Wijaya', 'KTP', '14700041098888', '2020-02-03 00:00:00', 'Male', 'Single', 'Jalan Anggrek nomor 11', '03/05', 'Kebon Jeruk', 'Sukabumi', 'Jakarta Barat', '11540', 'DKI Jakarta', 'Jalan Anggrek nomor 11', '03/05', 'Kebon Jeruk', 'Sukabumi', 'Jakarta Barat', '11540', 'DKI Jakarta', 'Yeni', 'Pekanbaru', '1990-07-08 00:00:00', 'Employee', '10000000', 'tantono_wijaya@mail.com', '0813757296840', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '9886850443936032', '715649'),
(3, '6385628673', 'Ms', 'Tri Utami', 'SIM', '940309160129', '2023-05-22 00:00:00', 'Female', 'Married', 'Jalan Yosowilangun', '01/03', 'Cempaka Putih', 'Cempaka Putih', 'Jakarta Pusat', '11111', 'DKI Jakarta', 'Jalan Yosowilangun', '01/03', 'Cempaka Putih', 'Cempaka Putih', 'Jakarta Pusat', '11111', 'DKI Jakarta', 'Nurlita', 'Surabaya', '1985-02-11 00:00:00', 'Wiraswasta', '60000000', 'nurlita@mail.com', '082648261495', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '294618506437', '615396'),
(4, '7154966305', 'Mr', 'Bayu Raharja', 'KTP', '8549936827953331', '2025-02-20 00:00:00', 'Male', 'Married', 'Jalan Asemrowo', '04/02', 'Asemrowo', 'Asemrowo', 'Surabaya', '72639', 'Jawa Timur', 'Jalan Kebon Kacang', '05/03', 'Kebon Kacang', 'Tanah Abang', 'Jakarta', '15589', 'DKI Jakarta', 'Fitrianti Indah', 'Surabaya', '1956-08-20 00:00:00', 'Wartawan', '5000000', 'bayu_rhj@mail.com', '0852602619563', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '639366016375', '816491'),
(5, '2659165027', 'Mrs', 'Aulia Rahayu', 'KTP', '147735629117491751', '2030-02-11 00:00:00', 'Female', 'Married', 'Jalan Limbungan', '01/06', 'Lembah Damai', 'Rumbai Pesisir', 'Pekanbaru', '28263', 'Riau', 'Jalan Tanjung', '03/05', 'Kebon Bawang', 'Tanjung Priok', 'Jakarta Utara', '17462', 'DKI Jakarta', 'Sri Asih', 'Pekanbaru', '1975-02-19 00:00:00', 'Ibu Rumah Tangga', '0', 'auli@mail.com', '089974628694', 'WNI', 3, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '726596782745', '736591'),
(6, '7397026581', 'Ms', 'Kelly Cornelia', 'Paspor', 'S0098165A0', '2021-01-05 00:00:00', 'Female', 'Single', 'Jalan Abdul Aliem', NULL, NULL, NULL, 'Singapura', '425723', 'Singapura', 'Jalan Setiabudi', '06/08', 'Menteng Atas', 'Setiabudi', 'Jakarta Selatan', '62859', 'DKI Jakarta', 'Lisa Manoban', 'Singapora', '1996-10-13 00:00:00', 'Doctor', '7000000', 'kelly@mail.com', '081365748674', 'WNA', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '768351048261', '756386'),
(7, '6184619674', 'Mr', 'Indra Kusuma', 'KTP', '9275935710671961', '2025-02-11 00:00:00', 'Male', 'Single', 'Jalan Kawi Kawi', '09/05', 'Johar Baru', 'Johar Baru', 'Jakara Pusat', '16583', 'DKI Jakarta', 'Jalan Kawi Kawi', '09/05', 'Johar Baru', 'Johar Baru', 'Jakara Pusat', '16583', 'DKI Jakarta', 'Nurwita', 'Jakarta', '1990-02-18 00:00:00', 'Peniliti', '12000000', 'indra@mail.com', '085275629562', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '6194621067195', '737991'),
(8, '957196719', 'Ms', 'Kartika Wahyu', 'KTP', '1759373591759361', '2030-06-05 00:00:00', 'Female', 'Single', 'Jalan Cakung', '09/08', 'Cakung Barat', 'Cakung', 'Jakara Timur', '17593', 'DKI Jakarta', 'Jalan Bambanglipuro', '09/08', 'Sumbermulyo', 'Bambanglipuro', 'Yogyakarta', '37926', '', 'Indah Permatasari', 'Jakarta', '1988-02-18 00:00:00', 'Guru', '5000000', 'kartika@mail.com', '081657561899', 'WNI', 3, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '821664016381', '375924'),
(12, '7264915497', 'Mr', 'Arif Kusumah', 'KTP ', '2893137182024064', '2030-10-27 00:00:00', 'Male', 'Married', 'Jalan Anggrek nomor 11', '03/05', 'Kebon Jeruk', 'Sukabumi', 'Jakarta Barat', '11540', 'DKI Jakarta', 'Jalan Cengkareng', '04/05', 'Cengkareng Barat', 'Cengkareng', 'Jakarta Barat', '17694', 'DKI Jakarta', 'Syifa Nuraini', 'Jakarta', '1996-02-11 00:00:00', 'Wartawan', '7000000', 'arif@mail.com', '08567591530', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '726501649671', '519461'),
(13, '0356148792', 'Mrs', 'Nur Intan', 'KTP', '1471659265978882', '2021-01-25 00:00:00', 'Female', 'Single', 'Jalan Kebayoran', '08/07', 'Cipulir', 'Kebayoran Lama', 'Jakarta Selatan', '17592', 'DKI Jakarta', 'Jalan Kebayoran', '08/07', 'Cipulir', 'Kebayoran Lama', 'Jakarta Selatan', '17592', 'DKI Jakarta', 'Sheila Majid', 'Jakarta', '1991-07-15 00:00:00', 'Pramugari', '12000000', 'intan@mail.com', '0817563956', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '1759174918376', '710948'),
(14, '8651204793', 'Mr', 'Eko Kurniawan', 'KTP', '1649478465157895173', '2025-07-22 00:00:00', 'Male', 'Married', 'Jalan Pancoran', '07/09', 'Pancoran', 'Pancoran', 'Jakarta Selatan', '17591', 'DKI Jakarta', 'Jalan Pakuan', '06/07', 'Ranggamekar', 'Bogor Selatan', 'Bogor', '71659', 'Jawa Barat', 'Elvira', 'Jakarta', '1985-12-15 00:00:00', 'Doctor', '150000000', 'eko@mail.com', '085972541865', 'WNI', 3, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '618461957254', '718406'),
(15, '1647382095', 'Mr', 'Hadi Irsyad', 'KTP', '8500539686781636', '2030-02-25 00:00:00', 'Male', 'Married', 'Jalan Ranggamekar', '03/05', 'Ranggamekar', 'Bogor Selatan', 'Bogor', '16136', 'Jawa Barat', 'Jalan Ranggamekar', '03/05', 'Ranggamekar', 'Bogor Selatan', 'Bogor', '16136', 'Jawa Barat', 'Elvira', 'Bogor', '1970-02-18 00:00:00', 'Pilot', '30000000', 'hadi@mail.com', '085247695208', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '140570608093', '721506'),
(16, '4079315826', 'Mrs', 'Annisa Septira', 'KTP', '6607294418685487', '2029-12-27 00:00:00', 'Female', 'Married', 'Jalan Mampang Prapatan', '03/02', 'Mampang Prapatan', 'Mampang Prapatan', 'Jakarta Selatan', '92385', 'DKI Jakarta', 'Jalan Mampang Prapatan', '03/02', 'Mampang Prapatan', 'Mampang Prapatan', 'Jakarta Selatan', '92385', 'DKI Jakarta', 'Eriwanti', 'Bandung', '1993-09-22 00:00:00', 'Karyawan Swasta', '10000000', 'annisa@mail.com', '087808596127', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '506036497650', '584109'),
(17, '1582397604', 'Mrs', 'Maria Rosa', 'KTP', '3102113170390085', '2030-02-19 00:00:00', 'Female', 'Married', 'Jalan Aren Jaya', '03/06', 'Aren Jaya', 'Bekasi Timur', 'Bekasi', '17111', 'Jawa Barat', 'Jalan Cakung', '09/08', 'Cakung Barat', 'Cakung', 'Jakarta Timur', '75213', 'DKI Jakarta', 'Yanti Susanto', 'Bekasi', '1979-12-19 00:00:00', 'Guru', '5000000', 'maria@mail.com', '089983652409', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '925381012461', '947816'),
(18, '5682409137', 'Mr', 'Nurul Ilham', 'KTP', '3348993323830227', '2040-09-16 00:00:00', 'Male', 'Single', 'Jalan Cengkareng', '07/08', 'Cengkareng Barat', 'Cengkareng', 'Jakarta Barat', '11670', 'DKI Jakarta', 'Jalan Cengkareng', '07/08', 'Cengkareng Barat', 'Cengkareng', 'Jakarta Barat', '11670', 'DKI Jakarta', 'Fitri Yani', 'Depok', '1998-08-30 00:00:00', 'Pelajar', '500000', 'ilham@mail.com', '081604725196', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '596321974606', '596321'),
(19, '1245978630', 'Ms', 'Retno Ningsih', 'KTP', '7209909004276170', '2030-02-21 00:00:00', 'Female', 'Single', 'Jalan Pasar Minggu', '09/05', 'Pasar Minggu', 'Pasar Minggu', 'Jakarta Selatan', '11875', 'DKI Jakarta', 'Jalan Pasar Minggu', '09/05', 'Pasar Minggu', 'Pasar Minggu', 'Jakarta Selatan', '11875', 'DKI Jakarta', 'Ningsih', 'Jakarta', '2020-05-13 00:00:00', 'Photographer', '6000000', 'retno@mail.com', '081330659217', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '843346815483', '046531'),
(20, '8192350764', 'Mrs', 'Nika Wulandari', 'KTP', '4204549432506362', '2030-02-24 00:00:00', 'Female', 'Married', 'Jalan Setiabudi', '04/06', 'Setiabudi', 'Setiabudi', 'Jakarta Selatan', '11867', 'DKI Jakarta', 'Jalan Setiabudi', '04/06', 'Setiabudi', 'Setiabudi', 'Jakarta Selatan', '11867', 'DKI Jakarta', 'Nia Ramdani', 'Pekanbaru', '1979-10-04 00:00:00', 'Artis', '2000000', 'nika@mail.com', '087765184279', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '489344354335', '894063'),
(25, '5746123098', 'Mr', 'Hanif Kusuma', 'KTP', '9355439450144982', '2030-12-24 00:00:00', 'Male', 'Single', 'Jalan Pondok Aren', '02/03', 'Pondok Aren', 'Pondok Aren', 'Tangerang Selatan', '15224', 'Banten', 'Jalan Pondok Aren', '02/03', 'Pondok Aren', 'Pondok Aren', 'Tangerang Selatan', '15224', 'Banten', 'Natasya', 'Banten', '1993-06-30 00:00:00', 'Karyawan Swasta', '10000000', 'hanif@mail.com', '081376509413', '', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '501038718880', '103871'),
(26, '6218534970', 'Mr', 'Rizki Septrianus', 'KTP', '5932197618953481', '2021-09-21 00:00:00', 'Male', 'Married', 'Jalan Cinere', '08/09', 'Cinere', 'Cinere', 'Depok', '16514', 'Jawa Barat', 'Jalan Cinere', '08/09', 'Cinere', 'Cinere', 'Depok', '16514', 'Jawa Barat', 'Yani Alfitri', 'Depok', '1990-09-20 00:00:00', 'Karyawan Swasta', '70000000', 'rizki@mail.com', '085537642581', 'WNI', 3, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '863805853892', '508538'),
(27, '7896543201', 'Mr', 'Andre Hesaunusa', 'KTP', '9443315317458275', '2030-02-28 00:00:00', 'Male', 'Married', 'Jalan Tebet', '07/09', 'Tebet Timur', 'Tebet', 'Jakarta Selatan', '11759', 'DKI Jakarta', 'Jalan Tebet', '07/09', 'Tebet Timur', 'Tebet', 'Jakarta Selatan', '11759', 'DKI Jakarta', 'Endang Kusnanti', 'Jakarta', '1977-06-16 00:00:00', 'Musisi', '14000000', 'andre@mail.com', '081905873642', 'WNI', 1, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '773675932204', '367593'),
(28, '3914258076', 'Ms', 'Dindra Annisa', 'KTP', '6702405347472649', '2030-05-26 00:00:00', 'Female', 'Married', 'Jalan Situgede', '07/09', 'Situgede', 'Bogor Barat', 'Bogor', '16115', 'Jawa Barat', 'Jalan Kebon Sirih', '07/08', 'Kebon Sirih', 'Menteng', 'Jakarta Pusat', '11534', 'DKI Jakarta', 'Hanifa Sulisyati', 'Bogor', '1996-02-25 00:00:00', 'Model', '15000000', 'dindra@mail.com', '087816052379', 'WNI', 3, '0000-00-00 00:00:00', '', '0000-00-00 00:00:00', '', '634575476793', '457547');

-- --------------------------------------------------------

--
-- Table structure for table `lookup`
--

CREATE TABLE `lookup` (
  `id` bigint(20) NOT NULL,
  `type` varchar(50) NOT NULL,
  `code` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `status` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `id` bigint(20) NOT NULL,
  `type` varchar(50) NOT NULL,
  `code` varchar(50) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`id`, `type`, `code`, `name`, `description`) VALUES
(1, 'customer', 'active', 'Active', NULL),
(3, 'customer', 'inactive', 'Inactive', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `unq_cifcode` (`cif_code`),
  ADD UNIQUE KEY `unq_pan` (`pan`),
  ADD KEY `fk_status` (`status`);

--
-- Indexes for table `lookup`
--
ALTER TABLE `lookup`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `type` (`type`,`code`),
  ADD KEY `cari_status` (`status`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `type` (`type`,`code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `lookup`
--
ALTER TABLE `lookup`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `status`
--
ALTER TABLE `status`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customers`
--
ALTER TABLE `customers`
  ADD CONSTRAINT `fk_status` FOREIGN KEY (`status`) REFERENCES `status` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lookup`
--
ALTER TABLE `lookup`
  ADD CONSTRAINT `cari_status` FOREIGN KEY (`status`) REFERENCES `status` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
