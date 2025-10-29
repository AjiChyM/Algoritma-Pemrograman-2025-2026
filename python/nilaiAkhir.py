tugas = float(input("Masukkan Nilai tugas:"))
uts = float(input("Masukkan Nilai UTS:"))
uas = float(input("Masukkan Nilai UAS:"))

nilai_akhir =(0.3*tugas) + (0.3*uts) + (0.4*uas)

print("Nilai akhir=", nilai_akhir)
if nilai_akhir>=60:
    print("status: LULUS")
else:
    print("Status: TIDAK LULUS")