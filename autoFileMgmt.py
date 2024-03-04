import os
import shutil

def sort_files(source_dir, destination_dirs):
    for file_name in os.listdir(source_dir):
        if os.path.isfile(os.path.join(source_dir, file_name)):
            file_extension = os.path.splitext(file_name)[1]
            destination_dir = destination_dirs.get(file_extension, 'Other')
            destination_path = os.path.join(source_dir, destination_dir)
            os.makedirs(destination_path, exist_ok=True)
            shutil.move(os.path.join(source_dir, file_name), os.path.join(destination_path, file_name))

# Example usage
source_directory = '/path/to/source'
destination_directories = {
    '.pdf': 'PDF_Files',
    '.docx': 'Word_Documents',
    '.xlsx': 'Excel_Sheets'
}
sort_files(source_directory, destination_directories)
