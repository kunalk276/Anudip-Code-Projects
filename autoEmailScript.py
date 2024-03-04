import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

def send_email(subject, message, to_email):
    # Set up SMTP server details
    smtp_server = 'smtp.example.com'
    smtp_port = 587
    smtp_username = 'your_email@example.com'
    smtp_password = 'your_password'

    # Create message
    msg = MIMEMultipart()
    msg['From'] = smtp_username
    msg['To'] = to_email
    msg['Subject'] = subject
    msg.attach(MIMEText(message, 'plain'))

    # Send email
    with smtplib.SMTP(smtp_server, smtp_port) as server:
        server.starttls()
        server.login(smtp_username, smtp_password)
        server.send_message(msg)

# Example usage
send_email('Weekly Progress Report', 'Attached is your weekly progress report.', 'client@example.com')
