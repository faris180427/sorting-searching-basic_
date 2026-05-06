class MyAlgorithms:
    # 1. BUBBLE SORT
    def bubble_sort(self, data):
        arr = data.copy()
        n = len(arr)
        for i in range(n):
            swapped = False
            for j in range(0, n - i - 1):
                if arr[j] > arr[j + 1]:
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
                    swapped = True
            if not swapped: # Optimasi berhenti awal
                break
        return arr

    # 2. BINARY SEARCH
    def binary_search(self, arr, target):
        low = 0
        high = len(arr) - 1
        while low <= high:
            mid = low + (high - low) // 2 # Optimasi cegah overflow
            if arr[mid] == target:
                return mid
            elif arr[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        return -1
