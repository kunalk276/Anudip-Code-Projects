import pandas as pd

def analyze_feedback(feedback_file):
    # Load data
    feedback_data = pd.read_csv(feedback_file)

    # Perform analysis
    positive_feedback = feedback_data[feedback_data['Sentiment'] == 'Positive']
    negative_feedback = feedback_data[feedback_data['Sentiment'] == 'Negative']

    # Generate report
    report = f"Positive feedback count: {len(positive_feedback)}\nNegative feedback count: {len(negative_feedback)}"
    
    return report

# Example usage
feedback_analysis = analyze_feedback('customer_feedback.csv')
print(feedback_analysis)
