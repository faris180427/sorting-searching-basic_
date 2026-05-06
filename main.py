from algorithms import MyAlgorithms

algo = MyAlgorithms()
data_mentah = [64, 34, 25, 12, 22, 11, 90]

# Proses Sorting
data_urut = algo.bubble_sort(data_mentah)
print(f"Data Awal: {data_mentah}")
print(f"Data Terurut (Bubble Sort): {data_urut}")

# Proses Searching
target = 22
index = algo.binary_search(data_urut, target)
print(f"Angka {target} ditemukan pada indeks ke: {index}")
