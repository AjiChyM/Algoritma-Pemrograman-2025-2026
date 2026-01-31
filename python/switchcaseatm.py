import sys

def format_rupiah(angka):
    return f"{angka:,}".replace(",", ".")

while True:
    nama = input("Masukan nama Anda: ")
    benar = input("Apakah nama sudah benar? (Y/N): ").lower()

    if benar == 'y':
        break
    else:
        print("Nama salah. Silakan masukkan nama lagi.")

nim_input = input("Masukan NIM Anda Untuk mengecek saldo: ")
nim = int(nim_input)

saldo = nim

print(f"Halo, {nama}!")
print(f"Saldo Anda adalah: Rp {format_rupiah(saldo)}")

print("=====Menu=====")
print("1. Cek Saldo")
print("2. Tarik Tunai")
print("3. Setor Tunai")
print("4. Tranfer")
print("5. keluar")

pilihan = int(input("Pilih menu (1-5):\n"))

if pilihan == 1:
    print(f"{nama},")
    print(f"Saldo Anda adalah: Rp. {format_rupiah(saldo)}")

elif pilihan == 2:
    tarik = int(input("Masukkan jumlah tarik tunai: Rp. "))
    
    if tarik > saldo:
        print(f"Saldo tidak mencukupi untuk tarik tunai sebesar Rp. {format_rupiah(tarik)}")
    else:
        saldo -= tarik
        print(f"Tarik tunai sebesar Rp. {format_rupiah(tarik)} berhasil.")
        print(f"Sisa saldo Anda: Rp. {format_rupiah(saldo)}")

elif pilihan == 3:
    setor = int(input("Masukkan jumlah setor tunai: Rp. "))
    saldo += setor
    print(f"Setor tunai sebesar Rp. {format_rupiah(setor)} berhasil.")
    print(f"Saldo Anda sekarang: Rp. {format_rupiah(saldo)}")

elif pilihan == 4:
    tranfer = int(input("Masukkan jumlah tranfer: Rp. "))
    saldo -= tranfer
    print(f"Tranfer sebesar Rp. {format_rupiah(tranfer)} berhasil.")
    print(f"Saldo Anda sekarang: Rp. {format_rupiah(saldo)}")

elif pilihan == 5:
    print("Keluar dari menu. Sampai jumpa lagi!")

else:
    print("Pilihan tidak valid. Silakan pilih menu antara 1-5.")

print("\nTerima kasih telah menggunakan layanan kami!")
print("==============")