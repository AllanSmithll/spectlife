-- Peixe Palhaço Taxonomy
INSERT INTO tb_taxonomy (dtype, domain, kingdom, phylum, class_name, order_name, family, genus)
VALUES ('Animal', 'Eukaryota', 'Animalia', 'Chordata', 'Actinopterygii', 'Perciformes', 'Pomacentridae', 'Amphiprion');

-- Peixe Palhaço
INSERT INTO tb_animal (scientific_name, common_name, habitat, geographic_distribution, origin_region, locomotion, type_food, hope_life, type_reproduction, fur_pattern, main_colors, average_length, period_pregnancy, url_img, additional_details, taxonomy_id)
VALUES ('Amphiprion ocellaris', 'Peixe Palhaço', 'Recifes de corais', 'Região Indo-Pacífica', 'Região Indo-Pacífica', 'AQUATIC', 'OMNIVORE', '5-10 anos', 'SEXUAL', 'Escamosa', 'Laranja e branco', '10-18 cm', '20-40 dias', 'https://images.pexels.com/photos/128756/pexels-photo-128756.jpeg?auto=compress&cs=tinysrgb&w=600', 'Peixe laranja com listras brancas mundialmente famoso', 1);

-- -- Cachorro
-- INSERT INTO tb_animal (scientific_name, common_name, habitat, geographic_distribution, origin_region, locomotion, type_food, hope_life, type_reproduction, fur_pattern, main_colors, average_length, average_width, average_height, breed, additional_details)
-- VALUES ('Canis lupus familiaris', 'Cachorro', 'Diversos', 'Mundial', , , '10-13 anos', , 'Variados', 'Varia', 'Varia', 'Varia', 'Labrador Retriever', 'Uma das raças mais populares devido à sua natureza amigável e inteligente.');