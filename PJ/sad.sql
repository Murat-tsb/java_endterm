PGDMP         6                y            library    13.0    13.0     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    41246    library    DATABASE     g   CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Kazakh_Kazakhstan.utf8';
    DROP DATABASE library;
                postgres    false                        3079    41247 	   uuid-ossp 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA public;
    DROP EXTENSION "uuid-ossp";
                   false            ?           0    0    EXTENSION "uuid-ossp"    COMMENT     W   COMMENT ON EXTENSION "uuid-ossp" IS 'generate universally unique identifiers (UUIDs)';
                        false    2            ?            1259    41261    books    TABLE     Z   CREATE TABLE public.books (
    book_id uuid NOT NULL,
    title text,
    author text
);
    DROP TABLE public.books;
       public         heap    postgres    false            ?            1259    41267    students    TABLE     N   CREATE TABLE public.students (
    student_id uuid NOT NULL,
    name text
);
    DROP TABLE public.students;
       public         heap    postgres    false            ?          0    41261    books 
   TABLE DATA           7   COPY public.books (book_id, title, author) FROM stdin;
    public          postgres    false    201   ?
       ?          0    41267    students 
   TABLE DATA           4   COPY public.students (student_id, name) FROM stdin;
    public          postgres    false    202          2           2606    41276    books book_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.books
    ADD CONSTRAINT book_pkey PRIMARY KEY (book_id);
 9   ALTER TABLE ONLY public.books DROP CONSTRAINT book_pkey;
       public            postgres    false    201            4           2606    41278    students student_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.students
    ADD CONSTRAINT student_pkey PRIMARY KEY (student_id);
 ?   ALTER TABLE ONLY public.students DROP CONSTRAINT student_pkey;
       public            postgres    false    202            ?   c   x?-?A
?0 ?s???@??i?<W/?? ???E?4?Ѩ,,?eDJ6?????jkV?D?d??v?|?????c?B?YZBb?hF???Z#?!??  7ȿR      ?   \   x?̹?0 ??bb?Nf???q>??LO??M????r?줣h???	?M?=?a/4\?e?B????{6???qL???e?? ??W,     