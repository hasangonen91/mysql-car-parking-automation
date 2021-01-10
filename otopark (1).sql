-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 18 May 2020, 13:01:58
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otopark`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `araclar`
--

CREATE TABLE `araclar` (
  `id` int(11) NOT NULL,
  `ad_soyad` varchar(90) COLLATE utf8_turkish_ci DEFAULT NULL,
  `plaka` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `marka` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `yas` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cep_no` varchar(15) COLLATE utf8_turkish_ci DEFAULT NULL,
  `giris_cikis` tinyint(1) DEFAULT NULL,
  `tarihi` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `saati` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `türü` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ucret` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `toplam_ucret` int(11) DEFAULT NULL,
  `yerler` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `araclar`
--

INSERT INTO `araclar` (`id`, `ad_soyad`, `plaka`, `marka`, `yas`, `cep_no`, `giris_cikis`, `tarihi`, `saati`, `türü`, `ucret`, `toplam_ucret`, `yerler`) VALUES
(1, 'ALEYNA TİLKİ', '01ADN81', 'TOFAŞ', '47', '05454157412', 0, '20.05.2020', '20.00', 'Otomobil', '5', 40, 'KAT 0 /A2'),
(2, 'MUSTAFA MURAT', '47JK58', 'FİAT', '75', '05460947548', 0, '10.05.2020', '11.00', 'Otomobil', '5', 25, 'KAT 0 /A5'),
(8, 'ALİ KEMAL', '34AT47', 'MERCEDES', '8', '05357415852', 0, '20 Mayıs 2020', '11.40', 'Kamyon', '5', 0, 'KAT 0/A12'),
(9, 'MURAT KIZIL', '34GH74', 'VOLVO', '4', '05358524141', 0, '04 Mart 2020', '09.20', 'Otomobil', '5', 0, 'KAT 3 /D12'),
(10, 'ÖZCAN DENİZ', '81DF47', 'TOYOTA', '8', '05748524141', 1, '31 Mart 2020', '11.20', 'Otomobil', '5', 0, 'KAT 0 /A3'),
(12, 'HASAN', '47HG91', 'BUGATTİ', '2', '05415029754', 1, '17 Mayıs 2020', '16.01', 'MOTOR', '5', 0, 'KAT 1 /C1'),
(13, 'FURKAN', '34AS43', 'FORD', '5', '05029875263', 1, '17 Mayıs 2020', '17.00', 'KAMYON', '5', 50, 'KAT 1 /B4'),
(14, 'İBRAHİM', '65TR76', 'NİSSAN GTR', '1', '05365204152', 1, '17 Mayıs 2020', '17.03', 'OTOMOBİL', '5', 0, 'KAT 3 /D6'),
(16, 'HASAN', '34BH91', 'BUGATTİ', '1', '05415029754', 1, '18 Mayıs 2020', '13.58', 'MOTOR', '5', 0, 'KAT 3 /D1');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac_hesabi`
--

CREATE TABLE `arac_hesabi` (
  `id` int(11) NOT NULL,
  `plaka` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `tutar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE `uyeler` (
  `id` int(11) NOT NULL,
  `kadi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `parola` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cepno` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `unvan` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `kadi`, `parola`, `cepno`, `unvan`) VALUES
(1, 'hasangonen91', '1', '05415029754', 'Müdür'),
(2, 'furkan', '1', '05051431915', 'Vale'),
(3, 'ibocan', '1', '05516035820', 'Vale'),
(6, 'buse', '1', '05430667748', 'buse'),
(7, 'barış', '1', '05367067581', 'barış');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `araclar`
--
ALTER TABLE `araclar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `arac_hesabi`
--
ALTER TABLE `arac_hesabi`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `araclar`
--
ALTER TABLE `araclar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Tablo için AUTO_INCREMENT değeri `arac_hesabi`
--
ALTER TABLE `arac_hesabi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
